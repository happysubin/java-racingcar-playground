package challenge;

import java.util.List;

public class CarRacingGame {

    private Cars cars;

    public CarRacingGame(List<String> names) {
        this.cars = new Cars(names);
    }

    public Cars getCars() {
        return cars;
    }
}
