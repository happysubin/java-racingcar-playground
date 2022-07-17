package challenge;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class OutputViewTest {

    @Test
    void getLocationViewTest() {
        //given

        //when
        String view = OutputView.getLocationView(5);

        //then
        assertThat(view).isEqualTo("-----");
    }

    @Test
    public void printCar() {
        //given
        Car car = new Car("sb");
        car.move(9);

        //when
        OutputView.printCar(car);
    }
}
