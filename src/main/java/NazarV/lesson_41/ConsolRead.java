package NazarV.lesson_41;

import java.util.Scanner;

public class ConsolRead implements IRead {
    public String readFrom() {
        Scanner inpput = new Scanner(System.in);
        String line = inpput.nextLine();
        return line;
    }
}
