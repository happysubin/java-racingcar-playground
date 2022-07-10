package refactoring;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    List<Car> cars;

    public Cars(String[] names) {
        this.cars = makeCars(names);
    }

    private List<Car> makeCars(String[] names) {
        List<Car> result = new ArrayList<>();
        for (String name : names) {
            result.add(new Car(name));
        }
        return result;
    }


    public List<Car> getCars() {
        return cars;
    }
}
