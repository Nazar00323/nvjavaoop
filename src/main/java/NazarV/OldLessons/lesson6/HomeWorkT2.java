package lesson6;

import java.util.Scanner;

/*
Написати програму, яка дає можливість користувачу ввести номер дня тижня,
а в результаті на екран буде виведено назву цього дня.
Приклад: Введіть номер дня: 7. Цим днем є Неділя.
 */
public class HomeWorkT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a=");
        double a = input.nextDouble();

        System.out.println("b=");
        double b = input.nextDouble();

        System.out.println("c=");
        double c = input.nextDouble();

        if (a > 1 && a < 3) {
            a++;
        } else {
            a = a / 10;
        }
        if (b>1 && b < 3){
            b++;
        }else{
            b = b / 10;
        }
        if (c > 1 && c < 3) {
            c++;
        } else {
            c = c / 10;
        }
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);



    }
}
