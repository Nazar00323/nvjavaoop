package NazarV.lesson_15;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class AccountsTest {
    public static void example(){
        System.out.println("It's work");
    }
    @Test
    public void ClientAccountsTest()throws Exception{
        int[] numbers = new int[10];
        Account[] accArray = new Account[5];

        Account acc1 = new Account();
        Account acc2 = new Account();
        Account acc3 = new Account();
        Account acc4 = new Account();
        Account acc5 = new Account();

        accArray[0] = acc1;
        accArray[1] = acc2;
        accArray[2] = acc3;
        accArray[3] = acc4;
        accArray[4] = acc5;

        for (int i = 0; i < accArray.length; i++) {
            accArray[i].information();
            System.out.println("-------------------");
        }
        example();
    }
}
