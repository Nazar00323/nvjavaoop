package NazarV.bank;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Client extends Human implements Serializable {
    private String phone;
    private Account clAc;

    public Client() {
        super();
        this.phone = generatePhoneNumber();
    }

    public Client(String name, String surname, String phone) {
        super(name, surname);
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
        final String [] PREFIX = {"097"};
        String phoneNumber = "";
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            phoneNumber += String.valueOf(random.nextLong());
        }
        StringBuilder modifiedPhoneNumber = new StringBuilder(phoneNumber);
        modifiedPhoneNumber.append( PREFIX[random.nextInt(11)]);
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

