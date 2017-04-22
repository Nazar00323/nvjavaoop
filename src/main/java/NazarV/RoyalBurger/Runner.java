package NazarV.RoyalBurger;

public class Runner {
    public static void main(String[] args) {
        Sale sale1 = new Sale();


        Product product1 = new Product("Пиво", 12);
        SaleLineItem item1 = new SaleLineItem(product1, 5);

        Product product2 = new Product("Чипси", 22);
        SaleLineItem item2 = new SaleLineItem(product1, 2);

        sale1.setItems(item1);
        sale1.setItems(item2);


        System.out.println("Загальна вартість покупки " + sale1.summaryPrice() );


        int summary = 0;

        for (int i = 0; i < sale1.getItems().size() ; i++) {
             summary += sale1.getItems().get(i).getItem().getPrice() * sale1.getItems().get(i).getQuantity();
        }

        System.out.println("Загальна вартість покупки " + summary );
    }

}
