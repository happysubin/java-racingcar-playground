package refactoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class InputUiTest {

    private InputUi inputUi;

    @BeforeEach
    void beforeEach(){
        inputUi = new InputUi();
    }

    @Test
    @DisplayName("차의 이름에 공백이 들어가면 안된다.")
    void uiTestV0(){
        assertThatThrownBy(() -> {
                inputUi.validate("");
                inputUi.validate(null);
        }).isInstanceOf(IllegalStateException.class);
    }

    @Test
    @DisplayName("차의 이름은 5글자 이하다.")
    void uiTestV1(){
        assertThatThrownBy(() -> {
            inputUi.validate("123456");
        }).isInstanceOf(IllegalStateException.class);
    }

    @Test
    @DisplayName("차의 이름 입력 성공 테스트.")
    void uiTestV2(){
        boolean result = inputUi.validate("subin");
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("차의 이름은 ,로 구분한다.")
    void uiTestV3(){
        String[] names = inputUi.split("1,2,3,4");

        assertThat(names[0]).isEqualTo("1");
        assertThat(names[3]).isEqualTo("4");
    }
}
