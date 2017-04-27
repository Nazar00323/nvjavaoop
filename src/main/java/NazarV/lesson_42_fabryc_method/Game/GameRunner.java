package NazarV.lesson_42_fabryc_method.Game;

public class GameRunner {
    public static void main(String[] args) {
        GameBoard.playGame(new ChessFactory());
        GameBoard.playGame(new CheckersFactory());
    }
}
