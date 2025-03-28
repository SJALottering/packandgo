package za.ca.cput.adp3capstone.repisitory;

import za.ca.cput.adp3capstone.domain.ItineraryDayActivity;

import java.util.HashMap;

public interface I_ItineraryDayActivity extends IRepository<ItineraryDayActivity, Integer>{
    HashMap<Integer, ItineraryDayActivity> getAll();
}
