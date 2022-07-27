package challenge;

import java.util.List;

public class Winner {
    public static void getFirst(Cars cars) {
        cars.printCars();
        Car firstRanking = cars.getFirstRanking(); //1등을 가져온다.

        List<Car> list = cars.getSameFirstRankings(firstRanking);


        System.out.println("car.getName().getName() = " + firstRanking.getName().getName());
        for (Car cars1 : list) {
            System.out.println(cars1.getName().getName());
        }
    }
}
