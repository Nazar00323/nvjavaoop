package NazarV.lesson_25;

public class Weapon {
    private int shoot;

    public Weapon() {
        this.shoot = 100;
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
    public String toString(){
        return " Weapon [shoot = "+ this.getShoot()+
                " Automaton [shoot = "+ this.getShoot()+
                " Pistol [shoot = "+ this.getShoot()+
                " Bow [shoot =  "+ this.getShoot()
                + "]";
    }
}
