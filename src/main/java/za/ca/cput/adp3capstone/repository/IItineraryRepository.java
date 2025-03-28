package za.ca.cput.adp3capstone.repository;
/* Itinerary.java
Itinerary Repository Interface class
Author: Seja Kgomokaboya (222152672)
Date:28 March 2025
*/

import za.ca.cput.adp3capstone.domain.Itinerary;

import java.util.HashMap;

public interface IItineraryRepository extends IRepository<Itinerary,String>{
    HashMap<String, Itinerary>  getAll();
}
