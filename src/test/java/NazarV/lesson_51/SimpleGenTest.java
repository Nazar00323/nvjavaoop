package NazarV.lesson_51;

import NazarV.bank.Account;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleGenTest {
    @Test
    public void showType() throws Exception {
        SimpleGen<Integer, String> someObj1 = new SimpleGen<Integer, String>(120, "Nazar");
        someObj1.showType();

        SimpleGen<String, Account> someObjString = new SimpleGen<String, Account>("Назар", new Account());
        someObjString.showType();

        //someObj1 = someObjString;

        /*Account ac1 = new Account();
        Account ac2 = new Account();
        ac1 = ac2;*/


    }

}