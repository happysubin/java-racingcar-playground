package challenge;

public class Position {

    public static final int STANDARD = 4;

    private int position;

    public Position() {
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public int move(int num) {
        if(num >= STANDARD ){
            position++;
        }
        return position;
    }
}
