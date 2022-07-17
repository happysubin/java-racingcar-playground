package challenge;

public class OutputView {
    public static void viewCar(Car car) {

    }

    public static String getLocationView(int position) {
        String location = "-";
        for (int i = 1 ; i < position; i++) {
            location += "-";
        }
        return location;
    }

}
