package challenge;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class OutputViewTest {

    @Test
    void getLocationViewTest() {
        //given

        //when
        String view = OutputView.getLocationView(5);

        //then
        assertThat(view).isEqualTo("-----");
    }
}
