package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarNameInputUitest {

    @Test
    @DisplayName("자동차 이름이 1개만 들어올 때")
    void carNameTestV1(){
        CarNameInputUi carInputUi = new CarNameInputUi();
        String[] names = carInputUi.inputName("subin,");
        assertThat(names[0]).isEqualTo("subin");
    }

    //TODO 여러 이름 넣기, 예외 생각하기
}
