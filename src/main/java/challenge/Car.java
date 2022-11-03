package challenge;

public class Car {

    private Name name;
    private Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position(StrategyFactory.createStrategy());
    }

    public Name getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public int move(int num) {
        int moveDistance = position.move(num);
        return moveDistance;
    }

    public Car compareCar(Car comparedCar) {
        if(comparedCar.isMoreThan(position)){
            return comparedCar;
        }
        return this;
    }

    public boolean isMoreThan(Position comparedPosition){
        if(comparedPosition.comparePosition(position) == position ) { //this가 1등 차.
            return true;
        }
        return false;
    }
}
