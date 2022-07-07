package racingcar;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RacingCarGameInputUiTest {
   @Test
   @DisplayName("레이싱 게임 라운드 횟수를 입력을 검증한다. 성공 테스트")
   void racingCarGameInputUiTestV1(){
       RacingCarGameInputUi ui = new RacingCarGameInputUi();
       int i = ui.inputRounds("4");
       assertThat(i).isEqualTo(4);

   }

    @Test
    @DisplayName("레이싱 게임 라운드 횟수를 입력을 검증한다. 실패 테스트")
    void racingCarGameInputUiTestV2(){
        assertThatThrownBy(() -> {
            RacingCarGameInputUi ui = new RacingCarGameInputUi();
            ui.inputRounds("ㅈ");
        }).isInstanceOf(IllegalStateException.class);

    }
}
