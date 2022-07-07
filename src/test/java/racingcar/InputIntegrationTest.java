package racingcar;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputIntegrationTest {

    @Test
    @DisplayName("성공하는 Input Test")
    void integrationTestV1(){
        CarNameInputSystem carInputUi = new CarNameInputSystem();
        String[] names = carInputUi.inputName("subin,eun,bi");

        assertThat(names[0]).isEqualTo("subin");
        assertThat(names[2]).isEqualTo("bi");

    }

    @Test
    @DisplayName("실패하는 Input Test")
    void integrationTestV2(){
        assertThatThrownBy(() -> {
            CarNameInputSystem carInputUi = new CarNameInputSystem();
            String[] names = carInputUi.inputName("subean,eun,bi");
        }).isInstanceOf(IllegalStateException.class);


    }
}
