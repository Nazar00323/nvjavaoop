package NazarV.bank;


public class Card extends Account {

    private int month;
    private int year;
    private int cvc;

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

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public  String toString(){
        return "CreditCard [month = " + this.getMonth()
                + " year = " + this.getYear()
                + " cvc = " + this.getCvc()
                + "]";
    }
}
