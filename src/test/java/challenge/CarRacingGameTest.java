package challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
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

    @Test
    void generateRandomTest() {
        //given
        List<String> names = new ArrayList<>();
        names.add("ah");
        names.add("sb");
        names.add("ho");
        CarRacingGame game = new CarRacingGame(names);

        //when
        List<Integer> randomList = game.getRandomList();

        assertThat(randomList.size()).isEqualTo(3);
    }


}
