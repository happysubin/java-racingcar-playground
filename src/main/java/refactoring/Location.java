package refactoring;

public class Location {

    private int position;

    public Location() {
        this.position = 0;
    }

    public int add(){
        position++;
        return position;
    }
}
