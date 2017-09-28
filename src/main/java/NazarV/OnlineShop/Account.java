package NazarV.OnlineShop;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class Account {
    private int id;
    private String number;
    private double balance;
    private String password;
    private LocalDate validity;

    public Account() {
        this.number = generateNumber();
        this.balance = 0;
        this.password = generatePassword();
        //this.validity = new GregorianCalendar(Calendar.YEAR + 3, Calendar.MONTH, Calendar.DATE);
        this.validity = LocalDate.of(LocalDate.now().getYear()+3,LocalDate.now().getMonth(),LocalDate.now().getDayOfMonth());
    }

    public Account(String number, int balance, String password, LocalDate validity) {
        this.number = number;
        this.balance = balance;
        this.password = password;
        this.validity = validity;
    }

    public Account(int id, String number, double balance, String password, LocalDate validity) {
        this.number = number;
        this.balance = balance;
        this.password = password;
        this.id = id;
        this.validity = validity;
    }

    public static Account createNew() {
        return new Account();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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

    public String getPassword() {
        return password;
    }

    public String checkPassword() {
        return password;
    }

    public LocalDate getValidity() {
        return validity;
    }

    public void setValidity(LocalDate validity) {
        this.validity = validity;
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
