package NazarV.OnlineShop;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends User{
    private String address;
    private Account creditCard;
    private String shippingInfo;
    private ArrayList<ShoppingCart> shoppingCarts;

    public Customer(String personId, String name, String surname, LocalDate birthDay,
                    String userId, String password, String login, String email,
                    String address, Account creditCard, String shippingInfo) {
        super(personId, name, surname, birthDay, userId, password, login, email);
        this.address = address;
        this.creditCard = creditCard;
        this.shippingInfo = shippingInfo;
        shoppingCarts = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Account getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Account creditCard) {
        this.creditCard = creditCard;
    }

    public String getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(String shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public ArrayList<ShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public void setShoppingCarts(ArrayList<ShoppingCart> shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", creditCard=" + creditCard +
                ", shippingInfo='" + shippingInfo + '\'' +
                '}';
    }
}
