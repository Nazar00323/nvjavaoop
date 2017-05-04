package NazarV.lesson_41;

public interface IPrint {
    void printTo(String str);

    default void showMessage() {
        System.out.println("Default message in interface IPrint");
    }

    static int getConstParam() {
        return 80;
    }
}
