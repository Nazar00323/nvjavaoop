package lesson5;

import java.util.Scanner;

/*
* Дано два числа p,m. Якщо p>m^2, то збільшити p в 5 раз.
* Перевірити приналежність отриманих значень до діапазону [4.0, 9.0], та вивести ті які входять до нього.
* */
public class HomeWorkT5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("p=");
        int p = input.nextInt();

        System.out.println("m=");
        int m = input.nextInt();

        if (p > Math.pow(m, 2)) {
            p = p * 5;
        }
        if (p >= 4 && p <= 9) {
            System.out.println("p="+p);
        }
        if (m >= 4 && m <= 9) {
            System.out.println("m="+m);
        }



    }
}
