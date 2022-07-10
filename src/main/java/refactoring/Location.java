package refactoring;

public class Location {

    private int location;

    public Location() {
        this.location = 1;
    }

    public int add(){
        location++;
        return location;
    }

    public int getLocation() {
        return location;
    }
}
