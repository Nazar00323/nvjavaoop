package lesson5;

/**
 * Created by NazarMykhailiv on 07.12.2016.
 */

/*
* Дано два дійсних числа.
* Замінити перше число нулем, якщо воно менше або рівне другому,  в іншому випадку поміняти числа місцями.
* */
public class ClassWorkT1 {
    public static void main(String[] args) {
        int x1 = 50;
        int x2 = 10;

        if (x1 <= x2) {
            x1 = 0;
        } else {
            int temp;
            temp = x1;
            x1 = x2;
            x2 = temp;
        }
        System.out.println("X1 = "+x1+" X2 = "+x2);
    }
}
