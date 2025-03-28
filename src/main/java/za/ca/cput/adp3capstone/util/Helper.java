package za.ca.cput.adp3capstone.util;

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
