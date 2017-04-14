package NazarV.RoyalBurger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Sale implements Serializable{
    private static int nextID = 1;
    private int id = 0;
    private GregorianCalendar date = null;
    private ArrayList<SaleLineItem> items = null;

    public Sale() {
        date = new GregorianCalendar();
        items = new ArrayList<SaleLineItem>();
        setId();
    }

    public Sale(GregorianCalendar date, ArrayList<SaleLineItem> items) {
        this.date = date;
        this.items = new ArrayList<SaleLineItem>(items);
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public ArrayList<SaleLineItem> getItems() {
        return items;
    }

    public void setItems(SaleLineItem item) {
        this.items.add(item);
    }

    public void setId() {
        this.id = nextID;
        nextID++;
    }

    public int getId() {
        return id;
    }

    public static void setNextId(int arg){
        nextID = arg;
    }

    public static void setNextID(int nextID) {
        Sale.nextID = nextID;
    }

    public double summaryPrice() {
        double bonus = 0.8;
        double fullPrice = 0;
        for (SaleLineItem item : items) {
            fullPrice += item.subPrice();
        }

        return fullPrice*bonus;
    }


    public void addLineItem(Product tempProduct, int quantity) {
        items.add(new SaleLineItem(tempProduct, quantity));
    }

    @Override
    public String toString() {
        String tempLine = "\n----------------------------------------\n"
                + "Номер чеку : " + id + "\n"
                + "ID\tНазва\tЦінаХ1\tКількість\tВартість\n";
        for (SaleLineItem item : items) {
            tempLine += item.toString() + "\n";
        }
        tempLine += "Загальна суму покупки: \t\t\t" + summaryPrice() + "\n";
        tempLine += "----------------------------------------\n";
        return tempLine;
    }
}
