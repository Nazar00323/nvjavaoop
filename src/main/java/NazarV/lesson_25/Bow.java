package NazarV.lesson_25;

public class Bow extends Weapon {

    public Bow() {
        super();
    }

    public Bow(int shoot) {
        super(shoot);
    }

    @Override
    public  void shoot(){
        System.out.println("Bow ---- стріляє");
    }
}

