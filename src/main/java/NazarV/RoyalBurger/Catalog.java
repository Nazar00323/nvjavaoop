package NazarV.RoyalBurger;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Catalog {
    private static ArrayList<Product> products = new ArrayList<Product>();
    private static final Logger log =  Logger.getLogger(Catalog.class);

    public static void setProducts() {
        Scanner input = new Scanner(System.in);
        String tempDescription = "";
        double tempPrice = 0;
        int exit = 0;
        do {
            System.out.print("Введіть назву продукту: ");
            tempDescription = input.next();
            System.out.print("Введіть ціну продукту:");
            tempPrice = input.nextDouble();
            products.add(new Product(tempDescription, tempPrice));
            System.out.print("Додати ще один продукт? (1 - НІ / 0 - ТАК ) :");
            exit = input.nextInt();
        } while (exit == 0);
        saveData();
    }

    private static void saveData() {
        try {
            FileOutputStream someFile = new FileOutputStream("productCatalog.ser");
            ObjectOutputStream someObj = new ObjectOutputStream(someFile);

            someObj.writeObject(products);

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
            FileInputStream someFile = new FileInputStream("productCatalog.ser");
            ObjectInputStream someObj = new ObjectInputStream(someFile);

            products = (ArrayList<Product>) someObj.readObject();
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

    }
}