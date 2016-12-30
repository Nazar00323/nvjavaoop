package lesson9;

/**
 * Created by NazarMykhailiv on 20.12.2016.
 */
public class ClassWorkT9_1 {
    public static void main(String[] args) {
        int maxSizeOfElements = 300;

        boolean done = false;
        int value = 0;

        /*for (int i = 1, k = 4; i < k; i++, k--) {
            System.out.println("i = " + i);
            System.out.println("k = " + k);
        }*/


        /*for (int i = 1; !done; i++) {
            if (i == 5) {
                done = true;
                System.out.println("i = " + i);
            }
        }*/

        /*for (;;){
            System.out.print(":) ");
        }*/

        for (;!done;){
            System.out.println("value =" + value);
            if (value == maxSizeOfElements) done = true;
            value++;
        }
    }
}
