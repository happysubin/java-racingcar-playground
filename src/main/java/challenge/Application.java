package challenge;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        CarRacingGame game = new CarRacingGame(inputView.getNames(), inputView.getNumberOfGame());
        game.play();
    }
}
