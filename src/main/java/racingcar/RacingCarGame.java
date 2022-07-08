package racingcar;

public class RacingCarGame {
    private int round;
    private Cars cars;

    public RacingCarGame(String round, String names ) {
        this.round = RacingCarGameInputSystem.inputRounds(round);
        this.cars = new Cars(names);
    }

    public Cars playGame(){
        cars.printCars();
        for (int i = 0; i < round; i++) {
            cars.playRacing();
        }
        return cars;
    }

    public int getRound() {
        return round;
    }
}
