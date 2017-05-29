package NazarV.lesson_44_DAO;

import java.util.GregorianCalendar;

public class Transaction  {
    private String acFrom;
    private String acTo;
    private int money;
    private GregorianCalendar date;
    private String description;
    private int id;

    public Transaction(String acFrom, String acTo, int money, GregorianCalendar date, String description, int id) {
        this.acFrom = acFrom;
        this.acTo = acTo;
        this.money = money;
        this.date = date;
        this.description = description;
        this.id = id;
    }

    public String getAcFrom() {
        return acFrom;
    }

    public void setAcFrom(String acFrom) {
        this.acFrom = acFrom;
    }

    public String getAcTo() {
        return acTo;
    }

    public void setAcTo(String acTo) {
        this.acTo = acTo;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
