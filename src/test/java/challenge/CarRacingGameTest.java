package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CarRacingGameTest {


    @Test
    void createGame() {
        //given
        List<String> names = new ArrayList<>();
        names.add("ah");
        names.add("sb");
        names.add("ho");

        //when
        CarRacingGame game = new CarRacingGame(names);

        //then
        assertThat(game.getCars().getCars().size()).isEqualTo(3);
    }
}
