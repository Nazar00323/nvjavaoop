package NazarV.lesson_53;

import NazarV.lesson_52.TwoD;

public class GenericMethodExample {
    public static <T extends TwoD, V extends T> boolean checkInside(T obj, V[] array) {
        for (int i = 0; i < array.length; i++) {
            if (obj.equals(array[i])) return true;
        }
        return false;
    }

    public static <T extends TwoD> boolean checkSumm(int summ,T[] array){
        for (int i = 0; i < array.length ; i++) {
            if (summ == (array[i].summXY())) return true;

        }
        return false;
    }
}
