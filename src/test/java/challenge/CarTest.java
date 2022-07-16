package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void createCar() {
        //given

        //when
        Car car = new Car("subin");

        //then
        assertThat(car.getName().getName()).isEqualTo("subin");
        assertThat(car.getPosition().getPosition()).isEqualTo(0);
    }
}
