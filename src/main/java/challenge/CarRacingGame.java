package challenge;

import java.util.ArrayList;
import java.util.List;

public class CarRacingGame {

    private Cars cars;

    public CarRacingGame(List<String> names) {
        this.cars = new Cars(names);
    }

    public Cars getCars() {
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
