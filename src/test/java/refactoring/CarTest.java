package refactoring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    @DisplayName("카 생성 테스트")
    void createCar() {
        String name = "subin";
        Car car = new Car(name);
        int result = car.getLocation().add();

        assertThat(car.getName().getName()).isEqualTo("subin");
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("카 이동  성공 테스트")
    void moveCarSuccess() {
        //given
        String name = "subin";
        Car car = new Car(name);

        //when
        Location location = car.move(5);

        //then
        assertThat(location.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("카 이동 실패 테스트")
    void moveCarFail() {
        //given
        String name = "subin";
        Car car = new Car(name);

        //when
        Location location = car.move(4);

        //then
        assertThat(location.getPosition()).isEqualTo(0);

    }
}
