package NazarV.lesson_33;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        int count = 0;
        int array[] = new int[20];
        Random random = new Random();

        for (int i = 0; i < 500; i++) {
            try {
                b = random.nextInt(50);
                c = random.nextInt(50);
                a = 5000 / (b / c);
                if(i > array.length){
                    throw new ArrayIndexOutOfBoundsException("Вихід за межі масиву");
                }else{
                    array[i] = a;
                }

            } catch (ArithmeticException e) {
                //e.printStackTrace();
                System.out.println("Ділення на ноль на ітерації " + i);
                count++;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            System.out.println("a = " + a);
        }
        System.out.println("Помилка виникла " + count + " разів");
    }
}
