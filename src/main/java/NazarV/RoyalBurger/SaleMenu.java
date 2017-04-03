package NazarV.RoyalBurger;

import java.util.Scanner;

public class SaleMenu {

    public static void run() {
        int choise = -1;
        do {
            showSaleMenu();
            choise = getChoise();
            openChoise(choise);
        } while (choise != 0);
    }

    private static void showSaleMenu() {
        System.out.println("----------------------");
        System.out.println("1 -");
        System.out.println("2 --");
        System.out.println("----------------------");
        System.out.println("0 - Вийти з програми");
    }

    private static int getChoise() {
        Scanner input = new Scanner(System.in);
        int temp;

        do {
            System.out.print("\nВиберіть пунк меню: ");
            temp = input.nextInt();
        } while (temp < 0 || temp > 2);

        return temp;
    }

    private static void openChoise(int ch) {
        switch (ch) {
            case 0:
                System.out.println("Дякуємо за співпрацю");
                break;
            case 1:
                System.out.println("  ");
                break;
            case 2:
                System.out.println(" ");
                break;


        }
    }
}
