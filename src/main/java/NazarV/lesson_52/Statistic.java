package NazarV.lesson_52;

public class Statistic<W extends Number > {
    private W[] numbers;

    public Statistic(W[] numbers) {
        this.numbers = numbers;
    }

    public double average(){
        double summ = 0;
        for (int i = 0; i <numbers.length; i++){
            summ+= numbers[i].doubleValue();
        }
        return summ/numbers.length;
    }

    public boolean sameAvg(Statistic<?> obj){
        if (average()==obj.average())return true;
        return  false;

    }
}
