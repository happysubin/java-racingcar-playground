package challenge;

public class OutputView {
    public static void printCar(Car car) {
        System.out.println(car.getName().getName() + " : " + getLocationView(car.getPosition().getPosition()));
    }

    public static String getLocationView(int position) {
        String location = "-";
        for (int i = 1 ; i < position; i++) {
            location += "-";
        }
        return location;
    }

}
