package challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class WinnerTest {

    @Test
    void winner() {
        Cars cars = new Cars(Arrays.asList("1", "2", "3"));
         Winner.getFirst(cars);
    }
}
