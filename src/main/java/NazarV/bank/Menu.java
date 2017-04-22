package NazarV.bank;

import java.util.Scanner;

public class Menu {

    public static void run() {
        int choise = -1;
        do {
            showMenu();
            choise = getChoise();
            openChoise(choise);
        } while (choise != 0);
    }

    private static void showMenu() {
        System.out.println("----------------------");
        System.out.println("1 - Список клієнтів");
        System.out.println("2 - Новий клієнт");
        System.out.println("3 - Видалити клієнта");
        System.out.println("4 - Знайти клієнта");
        System.out.println("----------------------");
        System.out.println("0 - Вийти з програми");
    }

    private static int getChoise() {
        Scanner input = new Scanner(System.in);
        int temp;

        do {
            System.out.print("\nВиберіть пунк меню: ");
            temp = input.nextInt();
        } while (temp < 0 || temp > 4);

        return temp;
    }

    private static void openChoise(int ch) {
        switch (ch) {
            case 0:
                System.out.println("Дякуємо за співпрацю");
                break;
            case 1:
                System.out.println("Тут буде список клієнтів");
                break;
            case 2:
                System.out.println("Тут буде додавання нового клієнта");
                break;
            case 3:
                System.out.println("Тут видалення клієнта");
                break;
            case 4:
                System.out.println("Тут буде пошук клієнта");
                break;
        }
    }
}
