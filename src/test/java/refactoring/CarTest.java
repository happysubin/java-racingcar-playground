package refactoring;

import org.assertj.core.api.Assertions;
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
}
