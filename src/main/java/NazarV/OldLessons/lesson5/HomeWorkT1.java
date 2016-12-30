package lesson5;

/**
 * Created by Nazzi on 07.12.2016.
 */

import java.lang.Math.*;

public class HomeWorkT1 {
    public static void main(String[] args) {
        int a = 3;
        int b = -5;
        int c = 6;
        int max;

        if (a > 0) {
            Math.pow(a, 2);

        }
        if (b > 0) b = (int) Math.pow(b, 2);
        if (c > 0) c = (int) Math.pow(c, 2);

        max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        System.out.println("max =" + max);


    }

}

