package za.ca.cput.adp3capstone.util;







public class Helper {
    public static boolean isNullorEmpty(String x){
        if(x.isEmpty() || x == null)
            return true;
        return false;
    }

    public static boolean isNull( int y){
        if(y == 0)
            return true;
        return false;
    }

    public static boolean isNull2(double z){
        if(z == 0.0)
            return true;
        return false;
    }
}
