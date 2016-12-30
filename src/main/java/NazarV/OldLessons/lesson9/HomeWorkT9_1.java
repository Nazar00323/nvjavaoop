package lesson9;

import java.util.Scanner;

/**
 * Знайти добуток всіх цілих чисел від a до b (значення a, b вводяться з клавіатури b≥a)
 */
public class HomeWorkT9_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;

        do {
            System.out.print("a=");
            a = in.nextInt();

            System.out.print("b=");
            b = in.nextInt();

            if(b<a) System.out.println("Змінна b має бути більшою за a!!!");

        } while (b<a);


        int counter;
        int dob = 1;

        for (counter = a; counter <= b; counter++) {
            dob = dob * counter;
        }

        System.out.println("Добуток від " + a + " до " + b + " рівний " + dob);
    }

}


