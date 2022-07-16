package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CarsTest {

    @Test
    void createCars() {
        List<String> list = new ArrayList<>();
        list.add("sb");
        list.add("sg");
        list.add("sdf");
        list.add("asdf");

        Cars cars = new Cars(list);
        assertThat(cars.getCars().get(0).getName().getName()).isEqualTo("sb");
        assertThat(cars.getCars().get(3).getName().getName()).isEqualTo("asdf");

    }

    @Test
    void moveCars() {
        //given
        List<String> list = new ArrayList<>();
        List<Integer> randomNumbers = Arrays.asList(4, 3, 9, 7);
        list.add("sb");
        list.add("sg");
        list.add("sdf");
        list.add("asdf");
        Cars cars = new Cars(list);

        //when
        cars.moveCars(randomNumbers);

        //then
        assertThat(cars.getCars().get(0).getPosition().getPosition()).isEqualTo(1);
        assertThat(cars.getCars().get(1).getPosition().getPosition()).isEqualTo(0);
    }
}
