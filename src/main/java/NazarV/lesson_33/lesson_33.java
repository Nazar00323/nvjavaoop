package NazarV.lesson_33;

public class lesson_33 {
    public static void main(String[] args) {
        try {
            subProgram();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void subProgram() throws ArithmeticException, NullPointerException{
        int d = 0;
        int a = 42 / d;
        System.out.println("Це не буде виведено на екран");
        System.out.println("Після помилки");

    }
}
