package NazarV.lesson_54;

public class QuickSort {
    public static<T extends Number> void sort(T[] A, int low, int high) {
        int i = low;
        int j = high;
        T x = A[low+(high-low)/2];
        do {
            while(A[i].doubleValue() < x.doubleValue()) ++i;
            while(A[j].doubleValue() > x.doubleValue()) --j;
            if(i <= j){
                T temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i ++ ; j --;
            }
        } while(i <= j);
        //рекурсивные вызовы функции qSort
        if(low < j) sort(A, low, j);
        if(i < high) sort(A, i, high);
    }
}
