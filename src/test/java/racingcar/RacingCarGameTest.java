package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RacingCarGameTest {

    @Test
    @DisplayName("게임 생성")
    void createGame(){
        RacingCarGame game = new RacingCarGame(5);

        assertThat(game.getRound()).isEqualTo(5);
    }
}
