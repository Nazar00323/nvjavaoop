package NazarV.lesson_42_fabryc_method.Game;

public class Checkers implements Game {
    private int moves = 0;
    private static int movesMax = 20;

    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != movesMax;
    }
}
