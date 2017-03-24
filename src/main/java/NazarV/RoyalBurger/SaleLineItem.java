package NazarV.RoyalBurger;

public class SaleLineItem {
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

    @Override
    public String toString() {
        return "SaleLineItem{" +
                "item=" + item.toString() +
                ", quantity=" + quantity +
                '}';
    }
}
