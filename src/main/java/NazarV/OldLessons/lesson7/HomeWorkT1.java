package lesson7;
/*
* Написати програму, яка дає можливість користувачу ввести номер дня тижня,
*а в результаті на екран буде виведено назву цього дня.
*Приклад: Введіть номер дня: 7. Цим днем є Неділя.
*/

import java.util.*;

public class HomeWorkT1 {


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a=");
        double a = input.nextDouble();

        if (a == 1) {
            System.out.println("Monday");
        } else if (a == 2) {
            System.out.println("Tuesday");
        } else if (a == 3) {
            System.out.println("Wednesday");
        } else if (a == 4) {
            System.out.println("Thursday");
        } else if (a == 5) {
            System.out.println("Friday");
        } else if (a == 6) {
            System.out.println("Saturday");
        } else if (a == 7) {
            System.out.println("sunday");
        }
    }
}



