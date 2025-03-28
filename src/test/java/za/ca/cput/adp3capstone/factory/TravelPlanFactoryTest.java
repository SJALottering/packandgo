package za.ca.cput.adp3capstone.factory;
/* TravelPlan.java
TravelPLan Factory test class
Author: Brezano Liebenberg (230463886)
Date: 28 March 2025
 */

import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.TravelPlan;

import static org.junit.jupiter.api.Assertions.*;

class TravelPlanFactoryTest {
    TravelPlanFactory travelPlanFactory = new TravelPlanFactory();
    TravelPlan travelPlan1 = travelPlanFactory.createTravelPlan("Package 1","Italy", 14, "Hotel",
            30000.00, "public transport", 5500.00,
            6500.00, "combo 2", 0.05, 1000.00);

    TravelPlan travelPlan2 = travelPlanFactory.createTravelPlan("Package 2","Italy", 21, "agriturismos (farm stays)",
            25000.00, "Car rental", 8000.00,
            12700.00, "combo 3", 0.05, 1000.00);


    TravelPlan travelPlan3 = travelPlanFactory.createTravelPlan("Package 3","Italy", 30, "Apartments",
            15000.00, "Uber", 12000.00,
            8400.00, "combo 1", 0.05, 1000.00);


    @Test
    void checkIfCreatedTravelPlanIsNotNull(){assertNotNull(travelPlan1);}
}