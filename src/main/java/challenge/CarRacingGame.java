package challenge;

import java.util.ArrayList;
import java.util.List;

public class CarRacingGame {

    private Cars cars;
    private int numberOfGames;

    public CarRacingGame(List<String> names, int numberOfGames ) {
        this.cars = new Cars(names);
        this.numberOfGames = numberOfGames;
    }

    public Cars getCars() {
        return cars;
    }

    public Cars play() {
        for (int i = 0; i < numberOfGames; i++) {
            List<Integer> randomList = getRandomList();
            cars.moveCars(randomList);
        }
        return cars;
    }

    public List<Integer> getRandomList(){
        List<Integer> randomNumberList = new ArrayList<>();
        for (int i = 0; i < cars.getCars().size(); i++) {
            randomNumberList.add(RandomUtils.generateRandomNumber());
        }
        return randomNumberList;
    }
}
