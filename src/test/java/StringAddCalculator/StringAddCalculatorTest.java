package StringAddCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringAddCalculatorTest {

    @Test
    @DisplayName("빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다")
    void empty(){
        StringAddCalculator calculator = new StringAddCalculator();
        int num1= calculator.calculate(null);
        int num2 = calculator.calculate("");
        assertThat(num1).isEqualTo(0);
        assertThat(num2).isEqualTo(0);
    }

    //영어로 일의 자리를 units라고 한다.

    @Test
    @DisplayName("숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다")
    void units(){
        StringAddCalculator calculator = new StringAddCalculator();
        int num1= calculator.calculate("9");
        assertThat(num1).isEqualTo(9);
    }

}