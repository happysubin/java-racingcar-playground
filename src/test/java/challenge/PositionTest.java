package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    void createPosition() {
        Position position = new Position();

        Assertions.assertThat(position.getPosition()).isEqualTo(0);
    }
}
