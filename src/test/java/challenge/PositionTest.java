package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PositionTest {

    @Test
    void createPosition() {
        Position position = new Position();

        assertThat(position.getPosition()).isEqualTo(1);
    }

    @Test
    void moveSuccessPosition() {
        //given
        Position position = new Position();

        //when
        position.move(5);

        assertThat(position.getPosition()).isEqualTo(2);
    }

    @Test
    void moveFailPosition() {
        //given
        Position position = new Position();

        //when
        position.move(3);

        assertThat(position.getPosition()).isEqualTo(1);
    }

    @Test
    void comparePositionTest(){
        //given
        Position position1 = new Position();
        position1.move(9);
        Position position2 = new Position();

        //when
        Position position = position1.comparePosition(position2);

        //then
        assertThat(position).isSameAs(position1);
    }
}
