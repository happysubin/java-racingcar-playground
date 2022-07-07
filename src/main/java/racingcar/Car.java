package racingcar;

public class Car {

    private final String name;
    private String location;

    public Car(String name) {
        this.name = name;
        this.location = "";
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void move(int num) {
        if(num >= 4) location += "-";
    }

    @Override
    public String toString() {
        return name + " : " + location;
    }
}
