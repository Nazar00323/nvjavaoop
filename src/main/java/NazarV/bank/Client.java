package NazarV.bank;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class Client extends Human implements Serializable {
    private String phone;
    private Account clAc;

    public Client() {
        super();
        this.phone = generatePhoneNumber();
    }

    public Client(String name, String surname, String phone, GregorianCalendar bornDate) {
        super(name, surname, bornDate);
        this.phone = phone;
    }

    public static Client createNew() {
        return new Client();
    }

    public void setAccount(Account ac) {
        this.clAc = ac;
    }

    public Account getAccount() {
        return this.clAc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPhone() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть номер телефону : ");
        this.phone = input.next();
    }

    public String generatePhoneNumber() {
        final String[] PREFIX = {"097", "068", "050", "099", "067"};
        final String[] NUMBERS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Random random = new Random();
        Date curdate = new Date();
        random.setSeed(curdate.getTime());
        StringBuilder modifiedPhoneNumber = new StringBuilder(10);
        modifiedPhoneNumber.append(PREFIX[random.nextInt(PREFIX.length)]);
        for (int i = 0; i < 7; i++) {
            modifiedPhoneNumber.append(NUMBERS[random.nextInt(NUMBERS.length)]);
        }

        return modifiedPhoneNumber.toString();
    }

    @Override
    public String toString() {
        return "Client{" +
                "name=" + getName() +
                ", surname=" + getSurname() +
                ", phone=" + phone +
                '}';
    }
}

