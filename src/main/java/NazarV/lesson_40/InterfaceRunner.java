package NazarV.lesson_40;

public class InterfaceRunner {
    public static void main(String[] args) {
        Client cl = new Client();
        cl.info();
        cl.callback(49);
        cl.outputMessage("Good news");

        ICallback cl2 = new Client();
        cl2.callback(50);

        IShow cl3 = new Client();
        cl3.outputMessage(" Bad news ");

        ICallback cl4 = new ClientB();

    }
}
