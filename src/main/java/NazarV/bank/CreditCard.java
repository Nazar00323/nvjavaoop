package NazarV.bank;

/**
 * Created by NAZZIK on 25.02.2017.
 */
public class CreditCard extends Card {
    private  int validity;
    private  int validation;

    public CreditCard() {
        super();
        this.validity = -1;
        this.validation = -1;
    }

    public CreditCard(int validity, int validation) {
        this.validity = validity;
        this.validation = validation;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public int getValidation() {
        return validation;
    }

    public void setValidation(int validation) {
        this.validation = validation;
    }

    public String toString() {

        return "CreditCard [validity = " + this.getValidity()
                + " validation = " + this.getValidation()
                + " month = " + this.getMonth()
                + " year = " + this.getYear()
                + " cvc = " + this.getCvc() + "]";
    }


}
