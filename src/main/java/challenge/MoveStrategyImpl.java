package challenge;

public class MoveStrategyImpl implements MoveStrategy{

    public static final int STANDARD = 4;

    @Override
    public int move(int num, int position) {
        if(num >= STANDARD){
            return ++position;
        }

        return position;
    }
}
