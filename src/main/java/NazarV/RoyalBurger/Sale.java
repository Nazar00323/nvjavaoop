package NazarV.RoyalBurger;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Sale {
    private GregorianCalendar date = null;
    private ArrayList<SaleLineItem> items = null;

    public Sale() {
        date = new GregorianCalendar();
        items = new ArrayList<SaleLineItem>();
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
}
