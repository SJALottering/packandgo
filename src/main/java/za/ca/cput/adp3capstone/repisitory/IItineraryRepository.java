package za.ca.cput.adp3capstone.repisitory;

import za.ca.cput.adp3capstone.domain.Itinerary;

import java.util.HashMap;

public interface IItineraryRepository extends IRepository<Itinerary,String>{
    HashMap<String, Itinerary>  getAll();
}
