package NazarV.lesson_53;

import NazarV.lesson_52.TwoD;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenericMethodExampleTest {
    @Test
    public void checkInside() throws Exception {
        TwoD tDObj[] = {new TwoD(5,10), new TwoD(3,7), new TwoD(2,5)};

        System.out.println(GenericMethodExample.checkInside(new TwoD(5,10), tDObj));
        System.out.println(GenericMethodExample.checkSumm(4,tDObj));

    }

}