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
        name = cl1.name;
        surname = cl1.surname;
        phone = cl1.phone;
    }

    public Client(){
        this.name = "Nazar";
        this.surname ="Voychack";
        this.phone = "0971073443";
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
