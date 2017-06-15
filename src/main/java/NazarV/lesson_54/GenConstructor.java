package NazarV.lesson_54;

public class GenConstructor {
    private double value;

    public <T extends Double> GenConstructor(T value) {
        this.value = value.doubleValue();
    }
    public void showValue(){
        System.out.println("value = "+value);
    }

    public static void main(String[] args) {
        GenConstructor testObj1 = new GenConstructor(20.20);
        testObj1.showValue();
    }
}
