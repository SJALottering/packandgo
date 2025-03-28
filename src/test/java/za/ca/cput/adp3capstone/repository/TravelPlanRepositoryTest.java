package za.ca.cput.adp3capstone.repository;
/* TravelPlan.java
TravelPLan Repository test class
Author: Brezano Liebenberg (230463886)
Date: 28 March 2025
 */


import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.TravelPlan;
import za.ca.cput.adp3capstone.factory.TravelPlanFactory;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class TravelPlanRepositoryTest {

    private  static ITravelPlanRepository repository = TravelPlanRepository.getRepository();

    private TravelPlan travelPlan1 = TravelPlanFactory.createTravelPlan("Package 1","Italy", 14, "Hotel",
            30000.00, "public transport", 4500.00,
            5500.00, "combo 2", 0.05, 1000.00);
    TravelPlan travelPlan2 = TravelPlanFactory.createTravelPlan("Package 2","Italy", 21, "agriturismos (farm stays)",
            25000.00, "Car rental", 8000.00,
            12700.00, "combo 3", 0.05, 1000.00);


    @Test
    void getTravelPlan() {
        TravelPlan testTravelPlan = repository.get("Package 1");
        assertNotNull(testTravelPlan);
    }

    @Test
    void createTravelPlan() {
        TravelPlan createdTravelPlan = repository.create(travelPlan1);
    }

    @Test
    void updateTravelPlan() {
        TravelPlan travelPlanToUpdate = TravelPlanFactory.createTravelPlan("Package 2","Italy", 21, "agriturismos (farm stays)",
                25000.00, "Car rental", 8000.00,
                14700.00, "combo 3", 0.05, 1000.00);
        TravelPlan travelPlanWithUpdatedDetails = TravelPlanFactory.createTravelPlan("Package 2","Italy", 21, "Hotel",
                32000.00, "public transport", 5500.00,
                7500.00, "combo 3", 0.05, 1000.00);


        TravelPlan updatedTravelPlan = repository.update(travelPlanToUpdate.getTravelPlanId(),travelPlanWithUpdatedDetails);
        assertNotNull(updatedTravelPlan);
    }

    @Test
    void deleteTravelPlan() {
        HashMap<String, TravelPlan> travelPlanHashMap = new HashMap<>();
        travelPlanHashMap.put(travelPlan1.getTravelPlanId(), travelPlan1);
        travelPlanHashMap.put(travelPlan2.getTravelPlanId(), travelPlan2);

        repository.create(travelPlan1);
        repository.create(travelPlan2);

        boolean isTravelPlanDeleted = repository.delete("Package 1");
        assertTrue(isTravelPlanDeleted);
    }

    @Test
    void getAllTravelPlan() {
        HashMap<String, TravelPlan> travelPlanHashMap = repository.getAll();
        assertNotNull(travelPlanHashMap);
    }
}