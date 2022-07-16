package challenge;

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

    @Test
    void moveCar(){
        //given
        Car car = new Car("sb");

        //when
        int moveDistance = car.move(5);
        int moveDistance2 = car.move(3);

        //then
        assertThat(moveDistance).isEqualTo(1);
        assertThat(moveDistance2).isEqualTo(1);
    }
}
