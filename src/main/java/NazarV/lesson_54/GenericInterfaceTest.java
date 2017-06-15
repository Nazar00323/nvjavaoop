package NazarV.lesson_54;

public class GenericInterfaceTest<T extends Comparable<T>> implements MinMax<T> {
    private T[] values;

    public GenericInterfaceTest(T[] values) {
        this.values = values;
    }

    @Override
    public T min() {
        T tempMinValue = values[0];

        for (int i = 0; i <values.length ; i++) {
            if(values[i].compareTo(tempMinValue)<0){
                tempMinValue = values[i];
            }

        }
        return tempMinValue;
    }

    @Override
    public T max() {
        T tempMaxValue = values[0];
        for (int i = 0; i <values.length ; i++) {
            if (values[i].compareTo(tempMaxValue)>0){
                tempMaxValue = values[i];
            }

        }
        return tempMaxValue ;
    }
}
