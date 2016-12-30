package lesson7;

import java.util.Scanner;

/**
 * Created by NazarMykhailiv on 16.12.2016.
 */
public class ClassWorkT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть номер місяця :");
        int month = input.nextInt();
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "літо";
                break;
            case 9:
            case 10:
            case 11:
                season = "осінь";
                break;
            default:
                season = "такого місяця не існує";
        }

        System.out.println("Місяць номер " + month + " належить до " + season);

    }

}
