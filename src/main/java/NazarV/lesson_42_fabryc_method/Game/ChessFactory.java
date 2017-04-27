package NazarV.lesson_42_fabryc_method.Game;

public class ChessFactory implements GameFactory {
    public Game getGame() {
        return new Chess();
    }
}
