package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    List<Car> cars;

    public Cars(String names) {
        cars = makeCarList(names);
    }

    private List<Car> makeCarList(String names) {
        List<Car> cars= new ArrayList<>();
        CarNameInputSystem carNameInputUi = new CarNameInputSystem();
        String[] list = carNameInputUi.inputName(names);
        for (int i = 0; i < list.length; i++) {
            cars.add(new Car(list[i]));
        }
        return cars;
    }

    public void playRacing(){
        for (int i = 0; i < cars.size(); i++) {
            int random = RandomUtils.generateRandomNumber();
            cars.get(i).move(random);
        }
        printCars();
    }

    public void printCars(){
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toString());
        }
        System.out.println();
    }

    public List<Car> getCars() {
        return cars;
    }
}
