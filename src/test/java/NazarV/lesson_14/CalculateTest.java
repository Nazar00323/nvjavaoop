package NazarV.lesson_14;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void add() throws Exception {
        int summ;
        String expression = "1+6+8+9";
        Calculate calc = new Calculate();
        summ = calc.add(expression);
        assertEquals(24, summ);
    }
}