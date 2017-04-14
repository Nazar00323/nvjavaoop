package NazarV.RoyalBurger;

import java.io.Serializable;

public class SaleLineItem implements Serializable{
    private Product item = null;
    private int quantity;

    public SaleLineItem() {
        item = new Product();
        quantity = 0;
    }

    public SaleLineItem(Product item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }



    public Product getItem() {
        return item;
    }

    public void setItem(Product item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double subPrice(){
        return item.getPrice()*quantity;
    }

    @Override
    public String toString() {
        return item.toString() + quantity+"\t\t\t"+subPrice();
    }
}
