package NazarV.RoyalBurger;

import org.apache.log4j.Logger;

import java.io.*;
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

        log.info(sale.toString());
        System.out.println(sale.toString());
        saveData();
    }

    private static void saveData() {
        try {
            FileOutputStream someFile = new FileOutputStream("Register.ser");
            ObjectOutputStream someObj = new ObjectOutputStream(someFile);

            someObj.writeObject(sales);

            someFile.close();
            someObj.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            log.info(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            log.info(e.getMessage());
        }
    }

    public static void getData() {

        try {
            FileInputStream someFile = new FileInputStream("Register.ser");
            ObjectInputStream someObj = new ObjectInputStream(someFile);

            sales = (ArrayList<Sale>) someObj.readObject();
            someFile.close();
            someObj.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            log.info(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            log.info(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            log.info(e.getMessage());
        }

        int maxId = 0;
        for (Sale sale : sales ) {
            if (sale.getId() > maxId) {
                maxId = sale.getId();
            }

        }
        Sale.setNextId(maxId + 1);

    }
}
