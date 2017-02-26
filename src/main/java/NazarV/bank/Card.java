package NazarV.bank;


public class Card extends Account {

    private int month;
    private int year;

    public Card() {
        super();
        month = -1;
        year = -1;
    }

    public Card(String number, int balance, String password, int month, int year) {
        super(number, balance, password);
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String toString() {
        return "CreditCard [month = " + this.getMonth()
                + " year = " + this.getYear()
                + "]";
    }
}
