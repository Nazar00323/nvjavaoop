package lesson3;
import static java.lang.Math.*;

/**
 * Created by Nazzi on 05.12.2016.
 */
public class HomeWorkT2 {
    public static void main(String[] args) {
        double y;
        double x = 3;
        double z = 7;
        y = 2 * Math.sin(Math.toRadians(x + z) / 2) * Math.sin(Math.toRadians(x - z) / 2);
        System.out.println("y=" + y);
    }

}






