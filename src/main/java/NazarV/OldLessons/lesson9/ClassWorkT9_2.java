package lesson9;

/**
 * Created by NazarMykhailiv on 20.12.2016.
 */
public class ClassWorkT9_2 {
    public static void main(String[] args) {
        int arraNumb[] = {1, 5, 7, 0, 8, 10};

        int choise = 10;

        int someNumbers[] = new int[choise];

        int sum = 1;

        for (int i = 0; i < 6; i++) {
            if (arraNumb[i] == 0) continue;
            if (arraNumb[i] % 2 == 0) {
                sum = sum * arraNumb[i];
            }
        }
        System.out.println("sum = " + sum);

        sum = 1;

        for (int x : arraNumb) {
            if (x == 0) continue;
            if (x % 2 == 0) sum *= x;
        }
        System.out.println("sum = " + sum);
    }
}
