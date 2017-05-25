package NazarV.bank;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Human {
    private String name;
    private String surname;
    private GregorianCalendar bornDate;

    public Human() {
        this.name = "Nazar";
        this.surname = "Voychak";
        this.bornDate = new GregorianCalendar();
    }

    public Human(String name, String surname,GregorianCalendar dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.bornDate = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть ім'я ");
        this.name = input.next();
    }

    public void setName(Human hm){
        this.name = hm.name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setSurname(String surname, int id) {
        this.surname = surname;
    }

    public void setSurname(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть прізвище: ");
        this.surname = input.next();
    }

    public GregorianCalendar getBornDate() {
        return bornDate;
    }

    public void setBornDate(GregorianCalendar bornDate) {
        this.bornDate = bornDate;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bornDate=" + bornDate.get(Calendar.YEAR)+
                "-"+bornDate.get(Calendar.MONTH)+
                "-"+bornDate.get(Calendar.DATE)+
                ' ';
    }
}
