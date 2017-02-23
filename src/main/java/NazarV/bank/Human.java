package NazarV.bank;

import java.util.Scanner;

public class Human {
    private String name;
    private String surname;

    public Human() {
        this.name = "Nazar";
        this.surname = "Voychak";
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    public  String toString(){
        return "Human [name = "+ this.getName()
                + " surname = " + this.getSurname()
                + "]";
    }
}
