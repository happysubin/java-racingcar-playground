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
        CarRacingGame game = new CarRacingGame(names,2 );

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
        CarRacingGame game = new CarRacingGame(names, 1);

        //when
        List<Integer> randomList = game.getRandomList();

        assertThat(randomList.size()).isEqualTo(3);
    }

    @Test
    void playGame() {
        //given
        List<String> names = new ArrayList<>();
        names.add("ah");
        names.add("sb");
        names.add("ho");
        CarRacingGame game = new CarRacingGame(names, 3){
            @Override
            public List<Integer> getRandomList() {
                return Arrays.asList(4, 5, 3);
            }
        };

        //when
        game.play();

        //then
        assertThat(game.getCars().getCars().get(0).getPosition().getPosition()).isEqualTo(4);
        assertThat(game.getCars().getCars().get(2).getPosition().getPosition()).isEqualTo(1);
    }
}
