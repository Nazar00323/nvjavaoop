package NazarV.lesson_54;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void sort() throws Exception {
        int size = 10;
        int maxValue = 100;
        Random random = new Random();
        Integer integerArray[] = new Integer[size];
        for (int i = 0; i <size ; i++) {
            integerArray[i] = random.nextInt(maxValue);
            System.out.print(integerArray[i] + " ");

        }

        GenericInterfaceTest<Integer> iObject = new GenericInterfaceTest<>(integerArray);
        System.out.println();
        System.out.println(iObject.min());
        System.out.println(iObject.max());
        //BubbleSort.sort(integerArray);
        //QuickSort.sort(integerArray,0,size-1);
       //BubbleSort.showArray(integerArray);
    }

}