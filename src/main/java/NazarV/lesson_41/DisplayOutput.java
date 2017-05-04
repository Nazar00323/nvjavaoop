package NazarV.lesson_41;

public class DisplayOutput implements IPrint {
    public void printTo(String str) {
        System.out.println("Show in display " + str);
    }

    public void showMessage() {
        System.out.println("Powered by BLABLABLA company");
    }
}
