package NazarV.lesson_52;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinateDisplayTest {
    @Test
    public void showXYZT() throws Exception {
        TwoD tDObj[] = {new TwoD(5,10), new TwoD(3,7), new TwoD(2,5)};
        ThreeD thDObj[] = {new ThreeD(1,4,8), new ThreeD(2,6,9),new ThreeD(4,1,5)};
        FourD fDObj[] = {new FourD(2,5,7,1), new FourD(7,6,4,2), new FourD(1,4,5,9)};

        Coordinates<TwoD> c1 = new Coordinates<TwoD>(tDObj);
        Coordinates<ThreeD> c2 = new Coordinates<ThreeD>(thDObj);
        Coordinates<FourD> c3 = new Coordinates<FourD>(fDObj);

        CoordinateDisplay.showXY(c1);
        CoordinateDisplay.showXY(c2);
        CoordinateDisplay.showXY(c3);

        //CoordinateDisplay.showXYZ(c1);
        CoordinateDisplay.showXYZ(c2);
        CoordinateDisplay.showXYZ(c3);

        CoordinateDisplay.showXYZT(c3);



    }

}