package NazarV.lesson_41;

public class Replacer {
    private IRead reader;
    private IPrint printer;

    public Replacer(IRead reader, IPrint printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public void replace(){
        String inputLine = reader.readFrom();
        String newLine = inputLine.replace("1","9");
        printer.printTo(newLine);
    }
}
