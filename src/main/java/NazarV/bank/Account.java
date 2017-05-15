package NazarV.bank;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Account {
    private String number;
    private int balance;
    private String password;
    private String id;

    public Account() {
        this.number = generateNumber();
        this.balance = 0;
        this.password = generatePassword();
    }

    public Account(String number, int balance, String password) {
        this.number = number;
        this.balance = balance;
        this.password = password;
    }

    public static Account createNew() {
        return new Account();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber() {
        this.number = "1231243423453452456236";
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String generateNumber() {
        final char[] PREFIX = {'4', '5'};
        String number = "";
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            number += String.valueOf(random.nextInt(10));
        }
        StringBuilder modifiedNumber = new StringBuilder(number);
        modifiedNumber.setCharAt(0, PREFIX[random.nextInt(2)]);
        return modifiedNumber.toString();
    }

    private String generatePassword() {
        String password = "";
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            password += String.valueOf(random.nextInt(10));
        }
        return password;
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

    public void putMoney() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть суму:");
        this.balance = this.balance + input.nextInt();
    }

    public void getMoney(int money) {
        this.balance = this.balance - money;
    }

    public void getMoney() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть суму:");
        this.balance = this.balance + input.nextInt();
    }


    public void setPassword(String pass) {
        this.password = pass;
    }

    public void setPassword() {

    }

    public String checkPassword() {
        return password;
    }

    public void information() {
        System.out.println("Card number :" + this.number);
        System.out.println("Card balance :" + this.balance);
        System.out.println("Card password :" + this.password);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
