package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    void createPosition() {
        Position position = new Position();

        Assertions.assertThat(position.getPosition()).isEqualTo(0);
    }

    @Test
    void moveSuccessPosition() {
        //given
        Position position = new Position();

        //when
        position.move(5);

        Assertions.assertThat(position.getPosition()).isEqualTo(1);
    }

    @Test
    void moveFailPosition() {
        //given
        Position position = new Position();

        //when
        position.move(3);

        Assertions.assertThat(position.getPosition()).isEqualTo(0);
    }
}
