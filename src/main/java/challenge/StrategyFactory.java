package challenge;

public class StrategyFactory {

    public static MoveStrategy createStrategy(){
        return new MoveStrategyImpl();
    }
}
