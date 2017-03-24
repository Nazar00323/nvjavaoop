package NazarV.RoyalBurger;

public class Runner {
    public static void main(String[] args) {
        Sale sale1 = new Sale();


        Product product1 = new Product("Potato", 6);
        SaleLineItem item1 = new SaleLineItem(product1, 5);

        sale1.setItems(item1);
    }
}
