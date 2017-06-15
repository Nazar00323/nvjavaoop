package NazarV.lesson_54;

public class BubbleSort {
    public static <R extends Number> void sort(R[] array) {
        int n = array.length;
        R temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1].doubleValue() > array[j].doubleValue()) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static <R extends  Number> void showArray(R[] array){
        System.out.println();
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
