/**
 * Created by Nazzi on 07.12.2016.
 */
package lesson3;

public class HomeWorkT3 {
    public static void main(String[] args) {
        double money = 5000;
        int mounth = 5;
        double sum = money;
        double stavka = 5;
        int daysInMonth = 31;
        int daysInYear = 365;

        for (int i = 0; i < mounth; i++) {
            sum += (money * (stavka/10)) / (daysInYear * daysInMonth);
        }

        System.out.println("All sum - " + sum);
        System.out.println("Prercent - " + (sum - money));//проценти
    }

}


