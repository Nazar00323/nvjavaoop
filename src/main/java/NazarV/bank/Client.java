package NazarV.bank;

public class Client extends Human {
    private String phone;
    private Account clAc;

    public Client() {
        super();
        this.phone = "0971073443";
    }

    public Client(String name, String surname, String phone) {
        super(name, surname);
        this.phone = phone;
    }

    public void setAccount(Account ac){
        this.clAc = ac;
    }
    public Account getAccount(){
        return this.clAc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void information(){
        System.out.println("Client name: "+ this.getName());
        System.out.println("Client surname: "+ this.getSurname());
        System.out.println("Client phone: "+ this.phone);
        clAc.information();
    }
}

