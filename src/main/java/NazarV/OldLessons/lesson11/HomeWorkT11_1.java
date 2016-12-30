package lesson11;

import java.util.Random;
import java.util.Scanner;

/*
* В масиві зберігаються дані про загальну вартість товарів,
 * проданих компанією за кожний день березня. [500-1000]+0.5
* Визначити кількість днів, в яких вартість проданих товарів перевищує значення s.
* */
public class HomeWorkT11_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randValue = new Random();
        int days = 31;
        double march[] = new double[days];
        double minPrice = 0;
        int dayCounter = 0;
        double findDays[] = new double[days];

        for (int i = 0; i < days; i++) {

            march[i] = 500 + randValue.nextInt(500) + randValue.nextDouble();
            System.out.println("days[" + (i + 1) + "] = " + march[i]);
        }

        do {
            System.out.print("Введіть мінімальну вартість проданих товарів: ");
            minPrice = input.nextDouble();
            if (minPrice < 500) {
                System.out.print("Мінімальна вартість проданих товарів не може бути менша 500!!! ");
            }
        } while (minPrice < 500);

        for (int i = 0; i < days; i++) {
            if (march[i] > minPrice) {
                findDays[i] = 1;
                dayCounter++;
            }
        }

        System.out.println("В даному місяці було " + dayCounter + " днів");
        for (int i = 0; i < days; i++){
            if (findDays[i] == 1){
                System.out.println("day[" + (i + 1) + "] = " + march[i]);
            }
        }
    }
}
