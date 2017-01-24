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

    @Test
    //TODO Task 1701
    public void constructorTest()throws Exception{
        Client cl = new Client();
        assertEquals("ClientName",cl.getName());
        assertEquals("ClientSurname", cl.getSurname());
        assertEquals(10,cl.getPhone().length());
    }

    @Test
    //TODO Task 1702
    public void contructParamTest()throws Exception{
        String name = "Nazar";
        String surname = "Voychak";
        String phone = "380971073443";

        Client cl = new Client(name, surname, phone);
        assertEquals(name,cl.getName());
        assertEquals(surname, cl.getSurname());
        assertEquals(phone,cl.getPhone());
    }

    @Test
    //TODO Task 1703
    public void constructCopyTest() throws Exception{
        String name = "Nazar";
        String surname = "Voychak";
        String phone = "380971073443";

        Client cl1 = new Client(name, surname, phone);
        Client cl2 = new Client(cl1);
        //Почитати що робить метод assertSame!!!
        assertSame(cl1,cl2);
    }
}
