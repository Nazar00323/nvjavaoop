/**
 * Created by Nazzi on 11.12.2016.
 */
package lesson6;
/*
*Дано дійсні числа x,y.
*Якщо x i y від’ємні, то кожне значення замінити його модулем.
*Якщо від’ємне тільки одне число, то обидва значення збільшити на 0,5.
*Якщо два значення додатні і ні одне із них не належить відрізку [0.5,2.0],
*то обидва значення зменшити в 10 раз.
*В інших випадках x та y залишити без змін.
*Вивести отриманий результат.
 **/

import java.util.Scanner;

public class HomeWorkT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Створення обєкту класу Scanner

        System.out.print("x=");
        int x = input.nextInt();
        System.out.print("y=");
        int y = input.nextInt();

        if (x < 0 && y < 0) {
            x = Math.abs(x);
            y = Math.abs(y);
            System.out.println("умова 1 x= " + x);
            System.out.println("умова 1 y= " + y);
        } else if (x < 0 || y < 0) {
            x += x * 0.5;
            y += y * 0.5;
            System.out.println("умова 2 x= " + x);
            System.out.println("умова 2 y= " + y);
        } else if (x > 0 && y > 0) {
            if (x >= 0.5 && y >= 0.5) {
                if (x <= 2 && y <= 2) {
                    x = x / 10;
                    y = y / 10;
                    System.out.println("умова 3 x= " + x);
                    System.out.println("умова 3 y= " + y);
                }
            }
        } else {
            System.out.println("умова 4 x= " + x);
            System.out.println("умова 4 y= " + y);
        }

        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
