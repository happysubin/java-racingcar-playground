package challenge;

public class Position {

    public static final int STANDARD = 4;

    private int position;

    public Position() {
        this.position = 1;
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

    public Position comparePosition(Position comparativePosition){
        if(comparativePosition.isMoreThan(position)){
            return comparativePosition;
        }
        return this;
    }

    private boolean isMoreThan(int comparativePosition) {
        return position > comparativePosition;
    }

}
