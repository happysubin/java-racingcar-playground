package challenge;

public class Position {

    private int position;
    private MoveStrategy moveStrategy;

    public Position(MoveStrategy moveStrategy) {
        this.position = 1;
        this.moveStrategy = moveStrategy;
    }

    public int getPosition() {
        return position;
    }

    public int move(int num) {
        this.position = moveStrategy.move(num, position);
        return this.position;
    }

    public Position comparePosition(Position comparativePosition){
        if(comparativePosition.isMoreThan(position)){
            return comparativePosition;
        }
        return this;
    }

    private boolean isMoreThan(int comparativePosition) {  //파라미터에 comparativePosition 1등이 들어가는게 아님. 비교 대상이 들어간다.
        return position > comparativePosition; //포지션이 1등차.
    }

}
