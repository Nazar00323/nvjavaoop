package NazarV.lesson_33;

import java.util.Random;
import java.util.Scanner;

public class MultiCatches {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        try {
            int a = input.nextInt();
            int b = random.nextInt(50);

            int c = b / a;

            int d[] = {a};
            d[2] = 50;
        } catch (ArithmeticException e) {
            System.out.println("Ділення на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Помилка індексації за межами масиву: " + e);
        }
        System.out.println("Після блоків try/catch");
    }
}
