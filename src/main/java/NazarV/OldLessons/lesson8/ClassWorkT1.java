package lesson8;

/**
 * Created by NazarMykhailiv on 16.12.2016.
 */

/*
* Знайти суму всіх цілих чисел від 150 до 300.
* */
public class ClassWorkT1 {
    public static void main(String[] args) {
        int startPoint = 150;
        int endPoint = 300;
        int summ = 0;
        int i = startPoint;

        while (i <= 300) {
            summ += i;
            i++;
        }
        System.out.println("Сума від " + startPoint + " до " + endPoint + " = " + summ);

        i = startPoint;
        summ = 0;
        do {
            summ += i;
            i++;
        } while (i <= 300);
        System.out.println("Сума від " + startPoint + " до " + endPoint + " = " + summ);

        summ = 0;
        for (i = startPoint; i <= 300; i++) {
            summ += i;
        }
        System.out.println("Сума від " + startPoint + " до " + endPoint + " = " + summ);
    }

}
