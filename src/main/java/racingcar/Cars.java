package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    List<Car> cars;

    public Cars(String[] names) {
        cars = makeCarList(names);
    }

    private List<Car> makeCarList(String[] names) {
        List<Car> cars= new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            cars.add(new Car(names[i]));
        }
        return cars;
    }

    public List<Car> getCars() {
        return cars;
    }
}
