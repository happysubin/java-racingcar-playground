package refactoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CarsTest {

    @Test
    void makeTest() {
        //given
        String[] names = {"1", "2", "3"};

        //when
        Cars cars = new Cars(names);

        //then
        List<Car> result = cars.getCars();
        Assertions.assertThat(result.get(0).getName().getName()).isEqualTo("1");
        Assertions.assertThat(result.get(2).getName().getName()).isEqualTo("3");

    }
}
