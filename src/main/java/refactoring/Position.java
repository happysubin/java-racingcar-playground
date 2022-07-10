package refactoring;

public class Position {

    private int position;

    public Position() {
        this.position = 0;
    }

    public int add(){
        position++;
        return position;
    }
}
