package NazarV.lesson_42_fabryc_method.Game;

public class CheckersFactory implements  GameFactory{
    public Game getGame() {
        return new Checkers();
    }
}
