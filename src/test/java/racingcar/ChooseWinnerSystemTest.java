package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ChooseWinnerSystemTest {
    
    @Test
    void WinnerTest(){
        //given
        Cars cars = new Cars("a,b,c");
        List<Car> list = cars.getCars();

        //when
        list.get(0).move(9);
        list.get(0).move(9);
        list.get(0).move(9);

        list.get(1).move(9);
        list.get(1).move(9);
        list.get(1).move(9);

        list.get(2).move(9);

        ChooseWinnerSystem winnerSystem = new ChooseWinnerSystem(cars);
        String s = winnerSystem.chooseWinner();
        Assertions.assertThat(s.contains("a, b")).isTrue();


    }
}
