package NazarV.lesson_33;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        int count = 0;
        Random random = new Random();

        for (int i = 0; i < 500; i++) {
            try {
                b = random.nextInt(50);
                c = random.nextInt(50);
                a = 5000 / (b / c);
            } catch (ArithmeticException e) {
                //e.printStackTrace();
                System.out.println("Ділення на ноль на ітерації " + i);
                count++;
            }
            System.out.println("a = " + a);
        }
        System.out.println("Помилка виникла "+count+" разів");
    }
}
