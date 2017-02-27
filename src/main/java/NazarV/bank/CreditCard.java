package NazarV.bank;


public class CreditCard extends Card {
    private int creditBalance;

    public CreditCard() {
        super();
        creditBalance = -1;
    }

    public CreditCard(String number, int balance, String password,
                      int month, int year, int cvc, int creditBalance) {
        super(number, balance, password, month, year, cvc);
        this.creditBalance = creditBalance;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    public String toString() {

        return "";
    }
}
