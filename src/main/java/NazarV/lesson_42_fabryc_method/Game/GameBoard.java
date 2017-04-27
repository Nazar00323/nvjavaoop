package NazarV.lesson_42_fabryc_method.Game;

public class GameBoard {
    public static void playGame(GameFactory gameFactory){
        Game gm = gameFactory.getGame();
        while(gm.move());
    }
}
