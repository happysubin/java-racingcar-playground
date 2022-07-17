package challenge;

public class Winner {
    public static void getFirst(Cars cars) {
        cars.printCars();
        Car car = cars.compareCars();
        System.out.println("car.getName().getName() = " + car.getName().getName());
    }
}
