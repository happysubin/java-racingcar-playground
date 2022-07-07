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

    @Test
    @DisplayName("자동차 이름이 여러개가 들어올 때")
    void carNameTestV2(){
        CarNameInputUi carInputUi = new CarNameInputUi();
        String[] names = carInputUi.inputName("subin,eun,bi");
        assertThat(names[0]).isEqualTo("subin");
        assertThat(names[1]).isEqualTo("eun");
        assertThat(names[2]).isEqualTo("bi");
    }

    @Test
    @DisplayName("자동차 이름이 안 들어올 때")
    void carNameTestV3(){
        assertThatThrownBy(()->{
            CarNameInputUi carInputUi = new CarNameInputUi();
            String[] names = carInputUi.inputName("");
            String[] names2 = carInputUi.inputName(null);
        }).isInstanceOf(IllegalStateException.class);
    }
}
