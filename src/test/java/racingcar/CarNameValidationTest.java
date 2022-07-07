package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarNameValidationTest {
    @Test
    @DisplayName("자동차 이름은 5 글자를 초과할 수 없다")
    void carNameValidationTestV1(){
        String[] names = {"subin", "eun", "bi"};
        String[] names2 = {"subinb", "eun", "bi"};
        boolean result = CarNameValidation.validateNameLength(names);
        boolean result2 = CarNameValidation.validateNameLength(names2);
        assertThat(result).isTrue();
        assertThat(result2).isFalse();
    }
}
