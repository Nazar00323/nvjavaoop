package NazarV.bank;


public class CreditCard extends Card {
    private int expDate;
    private int validation;

    public CreditCard() {
        super();
        this.expDate = -1;
        this.validation = -1;
    }


    public CreditCard(int validity, int validation) {
        this.expDate = validity;
        this.validation = validation;
    }

    public int getExpDate() {
        return expDate;
    }

    public void setExpDate(int expDate) {
        this.expDate = expDate;
    }

    public int getValidation() {
        return validation;
    }

    public void setValidation(int validation) {
        this.validation = validation;
    }

    public String toString() {

        return "CreditCard [expDate = " + this.getExpDate()
                + " validation = " + this.getValidation()
                + " month = " + this.getMonth()
                + " year = " + this.getYear() + "]";
    }


}
