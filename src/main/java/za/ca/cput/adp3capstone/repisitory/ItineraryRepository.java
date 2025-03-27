package za.ca.cput.adp3capstone.repisitory;

import za.ca.cput.adp3capstone.domain.Itinerary;
import za.ca.cput.adp3capstone.factory.ItineraryFactory;
import za.ca.cput.adp3capstone.repisitory.IItineraryRepository;

import java.io.IOException;
import java.util.HashMap;

public class ItineraryRepository implements IItineraryRepository {

    private ItineraryFactory itineraryFactory;
    public static IItineraryRepository repository = null;
    private HashMap<String, Itinerary> itineraryHashMap;

    private ItineraryRepository() throws IOException {
        itineraryHashMap = new HashMap<>();
        repository = getRepository();
        itineraryFactory = new ItineraryFactory();
    }

    private static IItineraryRepository getRepository() throws IOException {
        if (repository == null) {
            repository = new ItineraryRepository();
        }
        return repository;
    }

    @Override
    public Itinerary get(String id) {
        return itineraryHashMap.get(id);
    }

    @Override
    public Itinerary create(Itinerary itinerary) {
        if(itinerary ==null){
            return null;
        }
        itineraryHashMap.put(itinerary.getItineraryId(),itinerary);
        return itinerary;
    }

    @Override
    public Itinerary update(String id, Itinerary itinerary) {
        if (itinerary != null) {
            itineraryHashMap.put(id, itinerary);
            return itinerary;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Itinerary itinerary = get(id);
        if (itinerary != null) {
            itineraryHashMap.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public HashMap<String, Itinerary> getAll() {
        return itineraryHashMap;
    }
}