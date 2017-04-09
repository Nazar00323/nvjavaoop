package NazarV.RoyalBurger;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Sale {
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

    public static void setNextID(int nextID) {
        Sale.nextID = nextID;
    }

    public double summaryPrice(){
        double fullPrice = 0;
        for (SaleLineItem item : items){
            fullPrice +=  item.subPrice() ;
        }

        return fullPrice;
    }


    public void addLineItem(Product tempProduct, int quantity) {
        items.add(new SaleLineItem(tempProduct, quantity));
    }

    @Override
    public String toString() {
        String tempLine = "\n----------------------------------------\n"
                + "Номер чеку : " + id + "\n"
                + "ID\tНазва\tЦіна Х 1\tКількість\tВартість\n"


        return tempLine;
    }
}
