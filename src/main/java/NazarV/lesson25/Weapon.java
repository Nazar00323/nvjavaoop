package NazarV.lesson25;

public class Weapon {
    private int shoot;

    public Weapon() {
        this.shoot = -1;
    }

    public Weapon(int shoot) {
        this.shoot = shoot;
    }

    public  void shoot(){
        System.out.println("Weapon---- стріляє");
    }

    public int getShoot() {
        return shoot;
    }

    public void setShoot(int shoot) {
        this.shoot = shoot;
    }
}
