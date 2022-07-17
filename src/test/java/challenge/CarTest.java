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
        assertThat(car.getPosition().getPosition()).isEqualTo(1);
    }

    @Test
    void moveCar(){
        //given
        Car car = new Car("sb");

        //when
        int moveDistance = car.move(5);
        int moveDistance2 = car.move(3);

        //then
        assertThat(moveDistance).isEqualTo(2);
        assertThat(moveDistance2).isEqualTo(2);
    }

    @Test
    void compareCarPositionTest(){
        //given
        Car car1 = new Car("sb");
        car1.move(9);
        Car car2 = new Car("sf");

        //when
        Car car = car1.compareCar(car2);

        //then
        assertThat(car).isSameAs(car1);


    }
}
