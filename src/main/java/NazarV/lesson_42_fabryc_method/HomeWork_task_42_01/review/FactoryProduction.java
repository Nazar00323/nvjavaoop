package NazarV.lesson_42_fabryc_method.HomeWork_task_42_01.review;

import java.util.Scanner;

public class FactoryProduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String factoryType;
        int quantity;
        System.out.print("Яку фабрику запустити :");
        factoryType = input.next();
        System.out.print("Кількість одиниць продукції :");
        quantity = input.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Стільце №" + i);
            FurnitureProduction.runFactory(factoryType);
            System.out.println("Завершено\n\n");
        }

    }
}
