package NazarV.lesson_15;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void numberTest() {
        Account ac = new Account();
        String number = "8427456878965623";
        ac.setNumber(number);
        assertEquals(number, ac.getNumber());
    }

    @Test
    public void balanceTest() {
        Account ac = new Account();
        int balance = 5000;
        ac.setBalance(balance);
        assertEquals(balance, ac.getBalance());
    }

    @Test
    public void getMoney() {
        Account ac = new Account();
        int balance = 5000;
        int money = 200;
        ac.setBalance(balance);
        ac.getMoney(money);
        assertEquals(balance - money, ac.getBalance());
    }

    @Test
    public void putMoney() {
        Account ac = new Account();
        int balance = 5000;
        int money = 200;
        ac.setBalance(balance);
        ac.putMoney(money);
        assertEquals(balance + money, ac.getBalance());
    }

    @Test
    //Task 1601
    public void passwordTest() throws Exception  {

        Account ac = new Account();
        Random random = new Random();
        final String alphabet = "0123456789ABCDEFG";
        final int N = alphabet.length();
        StringBuilder tempPassword = new StringBuilder();
        //Тут генерується пароль із символів і цифр
        for (int i = 0; i < 8; i++) {
            tempPassword.append(String.valueOf(alphabet.charAt(random.nextInt(N))));
        }

        ac.setPassword(tempPassword.toString());
        assertEquals(tempPassword, ac.checkPassword());
    }
    //End Task 1601
}
