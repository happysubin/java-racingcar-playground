package refactoring;

import org.assertj.core.api.Assertions;
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
    void uiTest(){
        assertThatThrownBy(() -> {
                inputUi.validate("");
                inputUi.validate(null);
        }).isInstanceOf(IllegalStateException.class);
    }
}
