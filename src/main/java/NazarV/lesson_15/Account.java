package NazarV.lesson_15;


/*Task 1501 1502 1503*/
public class Account {
    private String number;
    private int balance;
    private String Password;



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
        balance = balance + money;
    }

    public void getMoney(int money) {
        balance = balance - money;
    }


    public void setPassword(String N) {

    }

    public String checkPassword() {
        return  Password;
    }
}
