package lesson9;

import static java.lang.Math.*;

import java.util.Scanner;


/**
 * Знайти середнє арифметичне квадратних коренів всіх цілих чисел від а до 30
 * (значення а вводиться з клавіатури; a≤30)
 */
public class HomeWorkT9_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b = 30;
        double average = 0;
        int counter = 0,i;
        do {
            System.out.print("a =");
            a = input.nextInt();
            if (a >= 30) System.out.println("а має бути менше за 30");
        } while (a >= 30);

        for ( i = a; i <= b; i++) {
            average = average + Math.sqrt (i);
            counter++;
        }
        System.out.println("середнє арифметичне: " + (average / counter));
    }
}