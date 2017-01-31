package NazarV.lesson_15;

public class Client {
    private String name;
    private String surname;
    private String phone;
    private Account[] clAc;

    public Client() {
        this.name = "ClientName";
        this.surname = "ClientSurname";
        this.phone = "0971073443";
        clAc = new Account[3];
    }

    public Client(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public Client(String name, String surname, String phone, Account account) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.clAc = new Account[1];
        this.setAccount(account);
    }

    public void setAccount(Account ac) {
        int actualSize = 0;
        for (int i = 0; i < this.clAc.length; i++) {
            if (this.clAc[i] == null){
                actualSize = i;
                break;
            }
        }
        if (actualSize == this.clAc.length){
            System.out.println("Перевищено ліміт рахунків!!!");
        }else{
            this.clAc[actualSize+1] = ac;
        }
    }

    public Account[] getAccount() {
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
        for (int i = 0; i < this.clAc.length; i++) {
            this.clAc[i].information();
        }
    }
}
