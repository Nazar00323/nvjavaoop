package NazarV.lesson_15;

import java.util.Random;

public class Account {
    private String number;
    private int balance;
    private String password;

    public Account() {
        this.number = this.generateVCNumber();
        this.balance = 0;
        this.password = "11111111";
    }

    public Account(String number, int balance, String password) {
        this.number = number;
        this.balance = balance;
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    //TODO Refactoring Example for lesson 21
    public void setNumber() {
        this.number = "1231243423453452456236";
    }

    public String generateVCNumber() {
        Random random = new Random();
        final String alphabet = "0123456789";
        final int N = alphabet.length();
        int size = 16;
        StringBuilder tempNumber = new StringBuilder(size);

        for (int i = 0; i < size; i++) {
            tempNumber.append(String.valueOf(alphabet.charAt(random.nextInt(N))));
        }

        tempNumber.setCharAt(0, '4');
        this.number = tempNumber.toString();

        return tempNumber.toString();
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void putMoney(int money) {
        this.balance = this.balance + money;
    }

    public void getMoney(int money) {
        this.balance = this.balance - money;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public String checkPassword() {
        return password;
    }

    public void information() {
        System.out.println("Card number :" + this.number);
        System.out.println("Card balance :" + this.balance);
        System.out.println("Card password :" + this.password);
    }
}
