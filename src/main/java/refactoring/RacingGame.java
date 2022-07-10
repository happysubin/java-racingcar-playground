package refactoring;

public class RacingGame {

    private int numberOfGame;
    private Cars cars;

    public RacingGame(String[] names, int numberOfGame) {
        this.cars = new Cars(names);
        this.numberOfGame = numberOfGame;
    }

    public Cars playGame(){
        cars.printCar();
        for (int i = 0; i < numberOfGame; i++) {
            cars.racing();
        }
        return cars;
    }

}
