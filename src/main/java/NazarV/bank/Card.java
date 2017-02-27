package NazarV.bank;


public class Card extends Account {

    private int expMonth;
    private int expYear;
    private int cvc;

    public Card() {
        super();
        expMonth = -1;
        expYear = -1;
        cvc = -1;
    }

    public Card(String number, int balance, String password, int month, int year, int cvc) {
        super(number, balance, password);
        this.expMonth = month;
        this.expYear = year;
        this.cvc = cvc;
    }

    public int getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(int expMonth) {
        this.expMonth = expMonth;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public String toString() {
        return "CreditCard [expMonth = " + this.getExpMonth()
                + " expYear = " + this.getExpYear()
                + "]";
    }
}
