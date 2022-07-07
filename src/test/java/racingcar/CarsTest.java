package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CarsTest {

    @Test
    @DisplayName("Cars 인스턴스를 생성")
    void CarsTestV1(){
        //given
        String[] names = {"subin", "eun", "bi", "seoul"};

        //when
        Cars cars = new Cars(names);

        //then
        List<Car> result = cars.getCars();
        Assertions.assertThat(result.get(0).getName()).isEqualTo("subin");
        Assertions.assertThat(result.get(3).getName()).isEqualTo("seoul");
    }
}
