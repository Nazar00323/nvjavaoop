package NazarV.lesson_25;

public class Automaton extends Weapon {

    public Automaton() {
        super();
    }
    public Automaton(int shoot) {
        super(shoot);
    }

    @Override
    public  void shoot(){
        System.out.println("Automaton ---- стріляє");
    }



}
