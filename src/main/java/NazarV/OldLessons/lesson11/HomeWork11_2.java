package lesson11;

import java.util.Random;

/**
 * Доступна така інформація про бої Василя Ломаченка:
 * було проведено 15 боїв, а також протягом кожного бою було нанесено від 650 до 2000 ударів.
 * Знайти та вевести на екран інформацію про бої в яких кількість нанесених ударів була більшою за середнє арифметичне значення кількості ударів,
 * які були нанесені протягом усіх боїв..
 */
public class HomeWork11_2 {
    public static void main(String[] args) {
        Random randValue = new Random();
        int fight = 15;
        int minShock = 650;
        int maxShock = 2000;
        double shock[] = new double[fight];
        int counter = 0;
        double average = 0;
        double findFight[] = new double[fight];

        for (int i = 0; i < fight; i++) {
            shock[i] = minShock + randValue.nextInt(maxShock - minShock) + randValue.nextDouble();
            System.out.println("Нанесено ударів[" + (i + 1) + "] = " + shock[i]);
        }

        for (int i = 0; i < fight; i++) {
            average = average + shock[i];
            counter++;
        }
        average = average / counter;
        System.out.println("середнє арифметичне: " + average);

        counter = 0;
        for (int i = 0; i < fight; i++) {
            if (shock[i] > average) {
                findFight[i] = 1;
                counter++;
            }
        }

        for (int i = 0; i < fight; i++) {
            if (findFight[i] == 1) {
                System.out.println("fight[" + (i + 1) + "] = " + shock[i]);
            }
        }

        System.out.println(" Із " + fight + " боїв  " + counter + " більше за середнє арифметичне ");

    }
}
