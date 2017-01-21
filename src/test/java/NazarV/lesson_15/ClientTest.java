package NazarV.lesson_15;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {
    @Test
    // Task 1602
    public void nameTest() throws Exception{
        Client cl = new Client();
        String tempName = "Nazar";
        cl.setName(tempName);
        assertEquals(tempName, cl.getName());
    }

    // End Task 1602
    @Test
    // Task 1603
    public void surnameTest() throws Exception{
        Client cl = new Client();
        String tempSurname = "Voychack";
        cl.setSurname(tempSurname);
        assertEquals(tempSurname, cl.getSurname());
    }

    // End Task 1603
    @Test
    // Task 1604
    public void phoneTest() throws Exception{
        Client cl = new Client();
        String tempPhone = "0971073443";
        cl.setPhone(tempPhone);
        assertEquals(tempPhone, cl.getPhone());
    }
    // End Task 1604
}
