package racingcar;

public class RacingCarGame {
    private int round;
    private Cars cars;

    public RacingCarGame(int round, String names ) {
        this.round = round;
        this.cars = new Cars(names);
    }

    public int getRound() {
        return round;
    }
}
