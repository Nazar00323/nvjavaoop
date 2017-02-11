package NazarV.lesson22;

import java.util.Scanner;

/**
 * Created by NAZZIK on 10.02.2017.
 */
public class StopWatchRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choise = 0;
        StopWatch sw = new StopWatch();

            do {
                System.out.println("1 - Start");
                System.out.println("2 - Stop" );
                System.out.println("3 - Pause" );
                System.out.println("4 - showTime" );
                System.out.println("5 - Clear" );
                System.out.print("Вибір: ");
                choise = input.nextInt();
                switch (choise){
                    case 1:sw.start(); break;
                    case 2:sw.stop(); break;
                    case 3:sw.pause(); break;
                    case 4:sw.showTime(); break;
                    case 5:sw.clear(); break;
                }
            }while(choise !=2);
        System.out.println("Time ="+ sw.getTime());

    }
}
