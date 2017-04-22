package NazarV.lesson_41;

public class Runner {
    public static void main(String[] args) {

        IRead consoleReader = new ConsolRead();
        IPrint consolePrinter = new ConsolePrint();
        IPrint displayPrinter = new DisplayOutput();
        Replacer replacer = new Replacer(consoleReader, displayPrinter);

        replacer.replace();
    }
}
