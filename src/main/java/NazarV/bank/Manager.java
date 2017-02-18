package NazarV.bank;

public class Manager extends Worker {
    public Manager() {
        super();
    }

    public Manager(String name, String surname, String id, String phone, double salary) {
        super(name, surname, id, phone, salary);
    }
    @Override
    public void setBonus(){
        setSalary(getSalary() + getSalary()*0.25);
        //salary+=salary*0.25;
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

