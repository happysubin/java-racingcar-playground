package StringAddCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringAddCalculatorTest {

    @Test
    @DisplayName("empty와 null이 들어갔을 때 테스트")
    void empty(){
        StringAddCalculator calculator = new StringAddCalculator();
        int num1= calculator.calculate(null);
        int num2 = calculator.calculate("");
        assertThat(num1).isEqualTo(0);
        assertThat(num2).isEqualTo(0);
    }
    //빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다.(

}