package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChooseWinnerSystem {

    private List<Rank> ranks ;

    public ChooseWinnerSystem(Cars cars) {
        this.ranks = createRanks(cars);
    }

    public List<Rank> createRanks(Cars cars){
        List<Rank> result = new ArrayList<>();
        List<Car> list = cars.getCars();
        for (Car car : list) {
            result.add(new Rank(car.getName(), car.getLocation()));
        }
        return result;
    }

    public String chooseWinner(){
        Collections.sort(ranks);
        String result = getResult();
        return result;
    }

    private String getResult() {
        int max = ranks.get(0).getPoint();
        String result = ranks.get(0).getName();
        for (int i = 1; i < ranks.size(); i++) {
            if(max > ranks.get(i).getPoint()) break;
            result = result + ", " + ranks.get(i).getName();
        }
        return result;
    }
}
