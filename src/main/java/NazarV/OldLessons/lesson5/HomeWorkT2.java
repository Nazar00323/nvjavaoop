/**
 * Created by Nazzi on 07.12.2016.
 */
package lesson5;

import java.lang.Math.*;
import java.util.Scanner;

public class HomeWorkT2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть a = ");
        int a = in.nextInt();
        int b = 5;
        int c = 6;
        int d = 9;
        int min;

        if (a > 0) a = (int) Math.pow(a, 3);
        if (b > 0) b = (int) Math.pow(b, 3);
        if (c > 0) c = (int) Math.pow(c, 3);
        if (d > 0) d = (int) Math.pow(d, 3);

        min = a;

        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;


        System.out.println("min =" + min);


    }

}