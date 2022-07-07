package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    @DisplayName("자동차 생성 테스트")
    void CarTestV1(){
        String name= "subin";
        Car car = new Car(name);
        assertThat(car.getLocation()).isEqualTo(0);
        assertThat(car.getName()).isEqualTo("subin");
    }
}
