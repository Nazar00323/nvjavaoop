package NazarV.bank;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void informationTest() throws Exception {
        ArrayList<Account> accounts = new ArrayList<Account>();
        for (int i = 0; i < 10 ; i++) {
            //accounts.add(new Account());
            accounts.add(Account.createNew());
        }

        for (Account account : accounts){
            System.out.println(account.toString());
        }
    }

}