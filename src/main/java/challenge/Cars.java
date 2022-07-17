package challenge;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars(List<String> carNames) {
        this.cars = makeCars(carNames);
    }

    private List<Car> makeCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    //매번 랜덤 생성한 리스트를 가져온다.
    public void moveCars(List<Integer> randomNumbers) {
        printCars();
        for (int i = 0; i < randomNumbers.size(); i++) {
            cars.get(i).move(randomNumbers.get(i));
        }
    }

    public void printCars(){
        for (Car car : cars) {
            OutputView.printCar(car);
        }
        System.out.println();
    }


    public Car compareCars() {
        Car car = cars.get(0);
        for (int i = 1; i < cars.size(); i++) {
            car = car.compareCar(cars.get(i));
        }
        return car;
    }
}
