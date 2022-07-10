package refactoring;

public class Application {
    public static void main(String[] args) {
        InputUi inputUi = new InputUi();
        String[] names = inputUi.getNames();
        int numberOfGame = inputUi.getNumberOfGame();

        RacingGame racingGame = new RacingGame(names, numberOfGame);
        racingGame.playGame();
    }
}
