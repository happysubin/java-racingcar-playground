package refactoring;

public class Car {

    private static final int ADD_STANDARD = 4;

    private Location location;
    private Name name;

    public Car(String name) {
        this.location = new Location();
        this.name = new Name(name);
    }

    public Location move(int number){
        if(number > ADD_STANDARD) location.add();
        return location;
    }

    public Location getLocation() {
        return location;
    }

    public Name getName() {
        return name;
    }
}
