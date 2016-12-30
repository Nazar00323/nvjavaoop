package lesson3;

import static java.lang.Math.*;
// Task done
public class ClassWorkL3 {
    public static void main(String[] args) {
        double h;
        double x=5;
        h=((8*pow(x,4))/cos(Math.toRadians(x)))+sin((Math.toRadians(x - Math.PI))/4);
        //h=cos(x);
        System.out.println("h=" +h);
    }
}

