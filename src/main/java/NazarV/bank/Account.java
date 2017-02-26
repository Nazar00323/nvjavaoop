package NazarV.bank;

import java.util.Scanner;

public class Account {
    private String number;
    private int balance;
    private String password;

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
        return "1231243423453452456236";
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
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть пароль:");
        this.password = input.next();
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
