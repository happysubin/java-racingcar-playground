package StringAddCalculator;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

public class SeparationUtilsTest {

    @Test
    @DisplayName("구분자에 의한 분할 확인 테스트")
    void separation(){
        SeparationUtils separationUtils = new SeparationUtils();
        String[] arr = separationUtils.separate("1,2,3,4");

        assertThat(arr[0]).isEqualTo("1");
        assertThat(arr[1]).isEqualTo("2");
        assertThat(arr[2]).isEqualTo("3");
        assertThat(arr[3]).isEqualTo("4");
    }
}
