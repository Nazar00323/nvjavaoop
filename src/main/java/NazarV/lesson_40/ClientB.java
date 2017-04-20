package NazarV.lesson_40;

public class ClientB implements ICallback {
    public void callback(int arg) {
        System.out.println("some args = " + arg);
    }
}
