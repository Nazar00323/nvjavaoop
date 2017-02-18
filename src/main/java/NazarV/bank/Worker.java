package NazarV.bank;

public class Worker extends Human{
    private String id;
    private String phone;
    private double salary;

    public Worker() {
        super();
        this.id = "4536473524374562";
        this.phone = "390680363051";
        this.salary = 5000;
    }

    public Worker(String name, String surname, String id, String phone, double salary) {
        super(name, surname);
        this.id = id;
        this.phone = phone;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Встановлення преміальних виплат робітникам
    public void setBonus(){
        //salary = salary + salary*0.2;
        salary+=salary*0.15;
    }

    public String toString(){
        return "Worker [name = "+ this.getName()
                + " surname = " + this.getSurname()
                + " id = " + this.id
                + " phone = " + this.phone
                + " salary = " + this.salary
                + "]";
    }
}
