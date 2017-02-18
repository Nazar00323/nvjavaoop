package NazarV.lesson_25;

public class Pistol extends Weapon {

    public Pistol() {
        this.getShoot();
    }

    public Pistol(int shoot) {
        super(shoot);
    }

    @Override
    public  void shoot(){
        System.out.println("Pistol ---- стріляє");
    }
}