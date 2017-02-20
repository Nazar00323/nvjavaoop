package NazarV.lesson_15;

import NazarV.bank.Account;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void numberTest() {
        String number = "8427456878965623";
        Account ac = new Account(number,0,"111");
        //ac.setNumber(number);
        assertEquals(number, ac.getNumber());
    }

    @Test
    public void balanceTest() {
        int balance = 5000;
        Account ac = new Account();
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
        StringBuilder tempPassword = new StringBuilder(8);
        //Тут генерується пароль із символів і цифр
        for (int i = 0; i < 8; i++) {
            tempPassword.append(String.valueOf(alphabet.charAt(random.nextInt(N))));
        }
        ac.setPassword(tempPassword.toString());
        assertEquals(tempPassword.toString(), ac.checkPassword());
    }
    //End Task 1601

    @Test
    public void generateNumberTest() throws Exception{
        Account ac = new Account();
        assertEquals(16, ac.getNumber().length());
    }

    @Test
    public  void overloadSetNumberTest()throws Exception{
        Account ac = new Account();
        Account ac2 = new Account();
        ac.setNumber();
        ac2.setNumber("1231243423453452456236");
        System.out.println("Card number 1 "+ac.getNumber());
        System.out.println("Card number 2 "+ac2.getNumber());
        assertEquals(ac.getNumber(), ac2.getNumber());
    }

    @Test
    public void generateVisaCardNumber() throws Exception{
        Account ac = new Account();
        //ac.generateVCNumber();
        //assertEquals(16, ac.generateVCNumber().length());
        //assertEquals("4", String.valueOf(ac.getCardNumber().charAt(0)));
    }
}
