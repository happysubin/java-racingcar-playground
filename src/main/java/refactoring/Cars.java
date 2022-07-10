package refactoring;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;
    private PrintUi printUi;

    public Cars(String[] names) {
        this.cars = makeCars(names);
        this.printUi = new PrintUi();
    }

    private List<Car> makeCars(String[] names) {
        List<Car> result = new ArrayList<>();
        for (String name : names) {
            result.add(new Car(name));
        }
        return result;
    }

    public Cars racing() {
        System.out.println();

        for (Car car : cars) {
            int randomNumber = getRandomNumber();
            car.move(randomNumber);
        }
        printCar();

        return this;
    }

    public void printCar(){
        for (Car car : cars) {
            printUi.printCar(car);
        }
    }

    public int getRandomNumber(){
        return RandomUtils.generateRandomNumber();
    }

    public List<Car> getCars() {
        return cars;
    }
}
