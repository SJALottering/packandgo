package za.ca.cput.adp3capstone.repository;

import za.ca.cput.adp3capstone.domain.TravelPlan;

import java.util.HashMap;


public interface ITravelPlanRepository extends IRepository<TravelPlan, String>{
    public HashMap<String, TravelPlan> getAll();

}
