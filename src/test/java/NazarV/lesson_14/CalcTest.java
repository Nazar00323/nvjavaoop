package NazarV.lesson_14;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {
    @Test
    public void add()throws Exception{
        Calc c1 = new Calc();
        assertEquals(8, c1.add(4,4));
    }
    @Test
    public void testSub()throws Exception{
        Calc c1 = new Calc();
        assertEquals(1, c1.sub(2,1));
    }
    @Test
    public void testMulti()throws Exception{
        Calc c1 = new Calc();
        assertEquals(4, c1.multi(2,2));
    }
    @Test
    public void testDiv()throws Exception{
        Calc c1 = new Calc();
        assertEquals(2, c1.div(4,2));
    }
}
