package za.ca.cput.adp3capstone.util;
/* TravelPlan.java
TravelPLan Util Helper class
Author: Brezano Liebenberg (230463886)
Date: 28 March 2025
 */

public class Helper {
    public static boolean isStringNullOrEmpty(String x){
        if(x.isEmpty() || x == null)
            return true;
        return false;
    }

    public static boolean isIntNull(int y){
        if(y == 0)
            return true;
        return false;
    }

    public static boolean isDoubleNull(double z){
        if(z == 0.0)
            return true;
        return false;
    }
}
