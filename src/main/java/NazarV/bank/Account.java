package NazarV.bank;

import org.apache.commons.lang.RandomStringUtils;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Account {
    private String number;
    private int balance;
    private String password;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Account() {
        this.number = this.generateNumber();
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

    public void setNumber() {
        this.number = "1231243423453452456236";
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String generateNumber() {
         final String[] VISA_PREFIX_LIST = new String[] { "4", "5" };
        String number = "";
        Date curentDate = new Date();
        Random random = new Random(curentDate.getTime());
        for (int i = 0; i < 16; i++) {
            number += String.valueOf(random.nextInt(10));
        }
        return number;
    }

    public String generatePassword() {
        String password = (" ");
        Date curentDate = new Date();
        Random random = new Random(curentDate.getTime());
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

}
