package refactoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CarsTest {

    @Test
    void makeTest() {
        //given
        String[] names = {"1", "2", "3"};

        //when
        Cars cars = new Cars(names);

        //then
        List<Car> result = cars.getCars();
        assertThat(result.get(0).getName().getName()).isEqualTo("1");
        assertThat(result.get(2).getName().getName()).isEqualTo("3");

    }

    @Test
    void racingTest() {
        //given
        String[] names = {"1", "2", "3"};

        //when
        Cars cars = new Cars(names){
            @Override
            public int getRandomNumber() {
                return 7;
            }
        };

        //then
        List<Car> result = cars.getCars();
        for (Car car : result) {
            assertThat(car.getLocation().getLocation()).isEqualTo(1);
        }

    }
}
