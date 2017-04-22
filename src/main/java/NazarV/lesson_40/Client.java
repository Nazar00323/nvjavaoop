package NazarV.lesson_40;

public class Client implements ICallback, IShow,IStack {
    public void callback(int arg) {
        System.out.println("some args = " + arg);
    }

    public void outputMessage(String text) {
        System.out.println("some text :" + text);
    }

    public void info() {
        System.out.println("Test code");
    }

    public void intNumber(int line) {

    }
}
