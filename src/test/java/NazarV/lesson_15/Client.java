package NazarV.lesson_15;

public class Client {
    private String name;
    private String surname;
    private String phone;


    public Client() {
        this.name = "ClientName";
        this.surname = "ClientSurname";
        this.phone = "0971073443" ;
    }

    public Client(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public Client(Client cl1) {
        this.name = cl1.name;
        this.surname = cl1.surname;
        this.phone = cl1.phone;
    }

     String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
