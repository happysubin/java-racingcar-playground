package StringAddCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringAddCalculatorTest {

    StringAddCalculator calculator;

    @BeforeEach
    void beforeEach(){
        calculator = new StringAddCalculator(new SeparationUtils());
    }

    @Test
    @DisplayName("빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다")
    void empty(){
        int num1= calculator.calculate(null);
        int num2 = calculator.calculate("");
        assertThat(num1).isEqualTo(0);
        assertThat(num2).isEqualTo(0);
    }

    //영어로 일의 자리를 units라고 한다.

    @Test
    @DisplayName("숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다")
    void units(){
        int num1= calculator.calculate("9");
        assertThat(num1).isEqualTo(9);
    }

    @Test
    @DisplayName("숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.(예 : “1,2”)")
    void sumWithCommas(){
        int num1= calculator.calculate("9,9,9");
        assertThat(num1).isEqualTo(27);
    }

    @Test
    @DisplayName("구분자를 컴마(,) 이외에 콜론(:)을 사용할 수 있다.")
    void sumWithCommasAndColons(){
        int num1= calculator.calculate("9,9,9:9");
        assertThat(num1).isEqualTo(36);
    }

    @Test
    @DisplayName(" “//”와 “\\n” 문자 사이에 커스텀 구분자를 지정할 수 있다.")
    void sumWithCustomSeparation(){
        int num1 = calculator.calculate("//;\n1;2;3");
        assertThat(num1).isEqualTo(6);
    }

    @Test
    @DisplayName("음수를 전달할 경우 RuntimeException 예외가 발생해야 한다.")
    void throwRunTimeExceptionWhenNumberIsMinus(){
        assertThatThrownBy(()->{
            calculator.calculate("-1,-1,3,4");
        }).isInstanceOf(RuntimeException.class);
    }
}