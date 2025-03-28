package za.ca.cput.adp3capstone.repisitory;
/* ItiniraryDayActivityRepository.java
Author: Luyanda Mbalenhle Makhanya (222788291)
Date: 28 March 2025
        */
import za.ca.cput.adp3capstone.domain.ItineraryDayActivity;

import java.util.HashMap;

public class ItineraryDayActivityRepository implements IItineraryDayActivityRepository {
      private static ItineraryDayActivityRepository repository= null;
      private HashMap<Integer, ItineraryDayActivity> activities;


     private ItineraryDayActivityRepository(){
         activities = new HashMap<>();
     }

     public static ItineraryDayActivityRepository getRepository(){
         if(repository==null){
             repository= new ItineraryDayActivityRepository();
         }
         return repository;
     }


    @Override
    public ItineraryDayActivity create(ItineraryDayActivity itineraryDayActivity) {
        if(itineraryDayActivity==null || itineraryDayActivity.getActivityId() <=0){
            return null;
        }

        activities.put(itineraryDayActivity.getActivityId(), itineraryDayActivity);
        return itineraryDayActivity;

    }

    @Override
    public ItineraryDayActivity update(Integer activityId, ItineraryDayActivity new_itineraryDayActivity) {
        if(!activities.containsKey(activityId)){
            return null;
        }
        activities.put(activityId, new_itineraryDayActivity);
        return new_itineraryDayActivity;
    }

    @Override
    public ItineraryDayActivity get(Integer activityId) {
        return activities.get(activityId);

    }


    @Override
    public boolean delete(Integer activityId) {
        ItineraryDayActivity deletedActivity = activities.remove(activityId);
        return deletedActivity!=null;
    }

    @Override
    public HashMap<Integer, ItineraryDayActivity> getAll() {
        return activities;
    }

}
