package NazarV.lesson_42_fabryc_method.Game;

public class Chess implements  Game{
    private int moves = 0;
    private static int movesMax = 10;

    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != movesMax;
    }
}
