package NazarV.lesson_51;

import NazarV.bank.Account;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void push() throws Exception {
        Random random = new Random();
        Stack<Account> integerStack = new Stack<Account>(20);

        for (int i = 0; i < 10; i++) {
            integerStack.push(new Account());
        }
        integerStack.showStack();

        integerStack.pop();
        integerStack.showStack();

    }

}