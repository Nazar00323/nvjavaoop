package NazarV.RoyalBurger;

public class Product {
    private static int nextId = 1;
    private int id;
    private String description;
    private double price;
    private double bonus;


    public Product() {
        setId();
        this.description = "0";
        this.price = 5;

    }

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public Product(String description, double price) {
        setId();
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId() {
        this.id = nextId;
        nextId ++;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}