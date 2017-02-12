package NazarV.bank;

public class Worker extends Human{
    private String id;
    private String phone;
    private String salary;

    public Worker() {
        super();
        this.id = "4536473524374562";
        this.phone = "390680363051";
        this.salary = "5000";
    }

    public Worker(String name, String surname, String id, String phone, String salary) {
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
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
