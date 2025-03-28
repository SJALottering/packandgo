package za.ca.cput.adp3capstone.repository;
/* TravelPlan.java
TravelPLan Repository Interface
Author: Brezano Liebenberg (230463886)
Date: 28 March 2025
 */

import za.ca.cput.adp3capstone.domain.TravelPlan;

import java.util.HashMap;


public interface ITravelPlanRepository extends IRepository<TravelPlan, String>{
    public HashMap<String, TravelPlan> getAll();

}
