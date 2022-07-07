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
        assertThat(car.getLocation()).isEqualTo("-");
        assertThat(car.getName()).isEqualTo("subin");
    }

    @Test
    @DisplayName("자동차 이동 테스트. 매개변수로 들어온 값이 4보다 클 때")
    void CarTestV2(){
        String name= "subin";
        Car car = new Car(name);
        car.move(3);
        assertThat(car.getLocation()).isEqualTo("-");
        assertThat(car.getName()).isEqualTo("subin");
    }

    @Test
    @DisplayName("자동차 이동 테스트. 매개변수로 들어온 값이 4보다 작을 때")
    void CarTestV3(){
        String name= "subin";
        Car car = new Car(name);
        car.move(4);
        assertThat(car.getLocation()).isEqualTo("--");
        assertThat(car.getName()).isEqualTo("subin");
    }
}
