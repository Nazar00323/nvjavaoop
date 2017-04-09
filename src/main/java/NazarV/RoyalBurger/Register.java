package NazarV.RoyalBurger;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    private static ArrayList<Sale> sales = new ArrayList<Sale>();
    private static final Logger log = Logger.getLogger(Register.class);

    public static Sale createSale(){
        Sale tempSale = new Sale();
        sales.add(tempSale);
        return tempSale;
    }

    public static void addItemToSale(Sale sale){
        Scanner input = new Scanner(System.in);
        int cont = -1;
        do {
            Product tempProduct = Catalog.chooseProduct();
            System.out.print("Введіть кількість даного продукту : ");
            int quantity = input.nextInt();
            sale.addLineItem(tempProduct, quantity);
            System.out.print("Добавити ще один продукт (1 - ТАК / 0 - НІ) : " );
            cont = input.nextInt();
        }while(cont!=0);

    }
}
