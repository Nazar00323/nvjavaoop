package NazarV.OnlineShop;

import java.time.LocalDate;

public class ShoppingCart {
    private int cartId;
    private Product product;
    private int quantity;
    private LocalDate date;

    public ShoppingCart(int cartId, Product product, int quantity, LocalDate date) {
        this.cartId = cartId;
        this.product = product;
        this.quantity = quantity;
        this.date = date;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartId=" + cartId +
                ", product=" + product +
                ", quantity=" + quantity +
                ", date=" + date +
                '}';
    }
}
