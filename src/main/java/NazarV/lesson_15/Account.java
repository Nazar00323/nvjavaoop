package NazarV.lesson_15;


/*Task 1501 1502 1503*/
public class Account {
    private String number;
    private int balance;
    private String password;

    public Account(){
        this.number = "-1";
        this.balance = -1;
        this.password = "-1";
    }

    public Account(String number, int balance, String password) {
        this.number = number;
        this.balance = balance;
        this.password = password;
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void putMoney(int money) {
        this.balance = this.balance + money;
    }

    public void getMoney(int money) {
        this.balance = this.balance - money;
    }


    public void setPassword(String pass) {
        this.password = pass;
    }

    public String checkPassword() {
        return password;
    }
}
