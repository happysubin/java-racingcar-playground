package refactoring;

public class PrintUi {
    
    public void printCar(Car car){
        String location = calculateLocation(car.getLocation());
        System.out.println(car.getName().getName() + " : " + location );
    }

    private String calculateLocation(Location location) {
        String result = "";
        for (int i = 0; i < location.getLocation(); i++) {
            result += "-";
        }
        return result;
    }
}
