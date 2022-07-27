package challenge;

import java.util.List;

public class Winner {
    public static void getFirst(Cars cars) {
        cars.printCars();
        Car firstRanking = cars.getFirstRanking(); //1등을 가져온다.

        List<Car> list = cars.getSameFirstRankings(firstRanking);

        System.out.print("우승자는 " + firstRanking.getName().getName());
        for (Car sameFirstRanking : list) {
            System.out.print(", " + sameFirstRanking.getName().getName());
        }
        System.out.print(" 입니다.");
    }
}
