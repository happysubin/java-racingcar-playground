package racingcar;

public class RacingCarGame {
    private int round;
    private Cars cars;

    public RacingCarGame(String round, String names ) {
        this.round = RacingCarGameInputSystem.inputRounds(round);
        this.cars = new Cars(names);
    }

    public void playGame(){
        for (int i = 0; i < round; i++) {
            cars.playRacing();
        }
    }

    public int getRound() {
        return round;
    }
}
