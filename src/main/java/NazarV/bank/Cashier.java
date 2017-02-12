package NazarV.bank;

public class Cashier extends Worker {
   private int cashNumber;

    public Cashier() {
        super();
        this.cashNumber = -1;
    }

    public Cashier(String name, String surname, String id, String phone, String salary, int cashNumber) {
        super(name, surname, id, phone, salary);
        this.cashNumber = cashNumber;
    }

    public int getCashNumber() {
        return cashNumber;
    }

    public void setCashNumber(int cashNumber) {
        this.cashNumber = cashNumber;
    }
    public String toString(){
        return "Cashier [name = "+ this.getName()
                + " surname = " + this.getSurname()
                + " id = " + this.getId()
                + " phone = " + this.getPhone()
                + " salary = " + this.getSalary()
                + " cashNumber = " + this.cashNumber
                + "]";
    }
}
