package lesson9;

/**
 * Created by NazarMh on 22.12.2016.
 */

import java.util.Random;

/**
 * Відомі дані про кількість опадів, які випали за кожний день лютого.
 * Вияснити чи вірне твердження, що по парних числах випало більше опадів ніж по непарних.
 * Дані про опади згенерувати рандомно.
 */

public class HomeWorkT9_3 {
    public static void main(String[] args) {
        Random randValue = new Random();

        int arrSize = 28;
        double summPanr = 0, summNep = 0;
        double days[] = new double[arrSize];

        for (int i = 0; i < arrSize; i++) {
            days[i] = randValue.nextDouble() + randValue.nextInt(4);
        }
        for (int i = 0; i < arrSize; i++) {
            System.out.println("days[" + (i + 1) + "] = " + days[i] + " ");
        }

        for (int i = 0; i < arrSize; i++) {
            if ((i + 1) % 2 == 0) {
                summPanr += days[i];
            } else {
                summNep += days[i];
            }
        }

        if (summPanr > summNep) {
            System.out.println("По парних числах випало більше опадів");
        } else {
            System.out.println("По не парних числах випало більше опадів");
        }
    }
}
