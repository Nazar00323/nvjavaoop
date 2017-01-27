package NazarV.lesson_15;

public class Client {
    private String name;
    private String surname;
    private String phone;
    private Account clAc;

    public Client() {
        this.name = "ClientName";
        this.surname = "ClientSurname";
        this.phone = "0971073443";
    }

    public Client(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public void setAccount(Account ac) {
        this.clAc = ac;
    }

    public Account getAccount() {
        return this.clAc;
    }

    public String getName() {
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

    public String setPhone(String phone) {
        if (phone.length() == 12) {
            this.phone = phone;
            return "Number was setup";
        }else return "Incorect phone number format";
    }

    public void information() {
        System.out.println("Client name: " + this.name);
        System.out.println("Client surname: " + this.surname);
        System.out.println("Client phone: " + this.phone);
        clAc.information();
    }
}
