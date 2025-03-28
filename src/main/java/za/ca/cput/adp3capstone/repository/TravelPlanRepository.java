package za.ca.cput.adp3capstone.repository;
/* TravelPlan.java
TravelPLan Repository Class
Author: Brezano Liebenberg (230463886)
Date: 28 March 2025
 */


import za.ca.cput.adp3capstone.domain.TravelPlan;
import za.ca.cput.adp3capstone.factory.TravelPlanFactory;
import za.ca.cput.adp3capstone.repository.ITravelPlanRepository;

//import java.io.IOException;
import java.util.HashMap;


public class TravelPlanRepository implements ITravelPlanRepository{

    public static ITravelPlanRepository repository = null;
    private HashMap<String ,TravelPlan> travelPlanHashMap;

    private TravelPlanRepository(){
        travelPlanHashMap = new HashMap<String, TravelPlan>();
    }

    public static ITravelPlanRepository getRepository(){
        if(repository == null) {
            repository = new TravelPlanRepository();
        }
        return repository;
    }

    @Override
    public TravelPlan get(String travelPlanId) {
        return travelPlanHashMap.get(travelPlanId);
    }

    @Override
    public TravelPlan create(TravelPlan travelPlan) {
        if(travelPlan == null){
            return null;
        }
        travelPlanHashMap.put(travelPlan.getTravelPlanId(), travelPlan);
        return travelPlan;
    }

    @Override
    public TravelPlan update(String travelPlanId, TravelPlan newTravelPlanId) {
        TravelPlan travelPlan = travelPlanHashMap.get(travelPlanId);
        TravelPlan updatedTravelPlan = newTravelPlanId;
        if(updatedTravelPlan!=null){
            travelPlanHashMap.put(travelPlanId, updatedTravelPlan);
            return updatedTravelPlan;
        }
        return null;
    }

    @Override
    public boolean delete(String travelPlanId) {
        TravelPlan travelPlan = travelPlanHashMap.get(travelPlanId);
        if(travelPlan == null){
            return false;
        }
        travelPlanHashMap.remove(travelPlanId);
        return true;
    }

    @Override
    public HashMap<String, TravelPlan> getAll(){
        if(travelPlanHashMap!=null){
            return travelPlanHashMap;
        }
        return null;
    }
}
