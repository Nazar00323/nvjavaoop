package NazarV.bank;

public class Manager extends Worker {
    public Manager() {
        super();
    }

    public Manager(String name, String surname, String id, String phone, String salary) {
        super(name, surname, id, phone, salary);
    }
    public String toString(){
        return "Manager [name = "+ this.getName()
                + " surname = " + this.getSurname()
                + " id = " + this.getId()
                + " phone = " + this.getPhone()
                + " salary = " + this.getSalary()
                + "]";
    }
}

