package za.ca.cput.adp3capstone.repisitory;
/* ItineraryDayActivity Repository Class
Author: Luyanda Mbalenhle Makhanya (222788291)
Date: 28 March 2025
        */
import za.ca.cput.adp3capstone.domain.ItineraryDayActivity;

import java.util.HashMap;

public interface IItineraryDayActivityRepository extends IRepository<ItineraryDayActivity, Integer>{
    HashMap<Integer, ItineraryDayActivity> getAll();
}
