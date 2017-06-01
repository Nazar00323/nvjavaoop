package NazarV.lesson_52;

import org.junit.Test;

import static org.junit.Assert.*;

public class StatisticTest {
    @Test
    public void average() throws Exception {
        Integer iNumber[] = {1, 2, 3, 4, 5};
        Double dNumber[] = {1.0, 2.0, 3.0, 4.0, 5.0};
        String lines[] = {"One","Two"};

        Statistic<Integer> iObject = new Statistic<Integer>(iNumber);
        Statistic<Double> dObject = new Statistic<Double>(dNumber);
       // Statistic<String>
        System.out.println("Середнє арифметичне iObject="+ iObject.average());
        System.out.println("Середнє арифметичне dObject="+ dObject.average());

        if ( iObject.sameAvg(dObject)){
            System.out.println("Середні арифметичні значення рівні  ");
        }else {System.out.println("Середні арифметичні значення різні  ");}

    }

}