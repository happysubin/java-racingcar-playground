package refactoring;

import org.junit.jupiter.api.Test;


public class PrintUiTest {
    @Test
    void print() {
        PrintUi printUi = new PrintUi();
        Car car = new Car("subin");
        car.move(5);
        car.move(5);

        printUi.printCar(car);
    }
}
