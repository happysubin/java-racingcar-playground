package refactoring;

public class Car {

    private Location location;
    private Name name;

    public Car(String name) {
        this.location = new Location();
        this.name = new Name(name);
    }

    public Location getLocation() {
        return location;
    }

    public Name getName() {
        return name;
    }
}
