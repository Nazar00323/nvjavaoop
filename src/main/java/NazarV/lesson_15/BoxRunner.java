package NazarV.lesson_15;

import java.util.Scanner;

public class BoxRunner {
    public static void main(String[] args) {
        Box b0;
        Box b1 = new Box();
        Box b2 = new Box();
        Scanner input = new Scanner(System.in);
        double  w,h,d;

        System.out.print("width = ");
        w = input.nextDouble();
        System.out.print("height = ");
        h = input.nextDouble();
        System.out.print("depth = ");
        d = input.nextDouble();

        b1.setWidth(w);
        b1.setHeight(h);
        b1.setDepth(d);

        b2.setWidth(15);
        b2.setHeight(25);
        b2.setDepth(35);

        b1.volume();
        b2.volume();

        b1.getWidth();


         /*b1.width = 10;
        b1.height = 20;
        b1.depth = 30;

        b2.width = 15;
        b2.height = 25;
        b2.depth = 35;*/

        /*volume = b1.width * b1.height * b1.depth;
        System.out.println("Обєм b1 = "+volume);

        volume = b2.width * b2.height * b2.depth;
        System.out.println("Обєм b2 = "+volume);*/

    }
}
