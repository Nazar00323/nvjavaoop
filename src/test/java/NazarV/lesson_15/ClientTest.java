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
    //Task 1701 - DONE
    public void constructorTest()throws Exception{
        Client cl = new Client();
        assertEquals("ClientName",cl.getName());
        assertEquals("ClientSurname", cl.getSurname());
        assertEquals(10,cl.getPhone().length());
    }

    @Test
    //Task 1702 - DONE
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
    public void compositionTest() throws Exception{
        String name = "Nazar";
        String surname = "Voychak";
        String phone = "380971073443";

        Client cl1 = new Client(name, surname, phone);
        Account ac1 = new Account();
        cl1.setAccount(ac1);
        assertEquals(ac1.getNumber(),cl1.getAccount().getNumber());

        cl1.information();
        System.out.println("");
        ac1.information();
    }
    @Test //TODO 1802
    public void phoneNumberTest() throws Exception{
        Client cl1 = new Client();
        String testPhone1 = "0971073443";
        String testPhone2 = "380971073443";
        assertEquals("Incorect phone number format",cl1.setPhone(testPhone1));
        assertEquals("Number was setup",cl1.setPhone(testPhone2));
    }
}
