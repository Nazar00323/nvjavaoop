/**
 * Created by Nazzi on 09.12.2016.
 */
package lesson5;

import java.lang.Math.*;
import java.util.Scanner;
/*
Дано дійсні числа x,y.
Якщо числа від’ємні взяти модуль від них.
Вивести x, якщо він більший за y, і два числа,якщо це не так.

1. Ввести х i y з клавіатури
2. Перевірити числа на відємність, якщо відємні взяти модуль
3. if()else

 */

public class HomeWorkT4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть x = ");
        int x = in.nextInt();
        System.out.print("Введіть y = ");
        int y = in.nextInt();
        if (x < 0) {

            x = Math.abs(x);
        }
        if (y < 0) {
            y = Math.abs(y);
        }
        if (x > y) {
            System.out.println("x=" + x);
        } else {
            System.out.println("x=" + x);
            System.out.println("y=" + y);
        }

    }
}
