package NazarV.lesson_33;

public class lesson_33 {
    public static void main(String[] args) {
        subProgram2();
    }

    static void subProgram() {
        try {
            int d = 0;
            int a = 42 / d;
            System.out.println("Це не буде виведено на екран");
        } catch (ArithmeticException e) {
            System.out.println("Ділення на ноль");
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("Після помилки");

    }

    static void subProgram2() {

        int d = 0;
        int a = 42 / d;

        System.out.println("Після помилки");

    }
}
