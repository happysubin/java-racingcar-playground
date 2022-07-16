package challenge;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class InputViewTest {


    @Test
    void splitName() {
        //given
        String names = "sb,ab,sh,ho";
        InputView inputView = new InputView();

        //when
        List<String> list = inputView.split(names);

        //then
        assertThat(list.get(0)).isEqualTo("sb");
        assertThat(list.get(3)).isEqualTo("ho");
    }

    @Test
    void nameValidate() {
        //given
        String names = "sb1233,ab,sh,ho";
        InputView inputView = new InputView();
        List<String> list = inputView.split(names);

        assertThatThrownBy(() -> {
            //when
            inputView.validate(list);

            //then
        }).isInstanceOf(IllegalStateException.class);
    }

    @Test
    void integrateNameSuccessTest() {
        //given
        InputView inputView = new InputView(){
            @Override
            public String getString() {
                return "sb,ab,sh,ho";
            }
        };

        List<String> names = inputView.getNames();

        assertThat(names.get(0)).isEqualTo("sb");
        assertThat(names.get(3)).isEqualTo("ho");
    }

    @Test
    void integrateNameFailTest() {
        //given
        InputView inputView = new InputView(){
            @Override
            public String getString() {
                return "sbsbsbsb,ab,sh,ho";
            }
        };

        assertThatThrownBy(() -> {
            //when
            inputView.getNames();

            //then
        }).isInstanceOf(IllegalStateException.class);
    }

    @Test
    void inputNumberOfGameSuccessTest() {
        //given
        InputView inputView = new InputView(){
            @Override
            public String getString() {
                return "3";
            }
        };

        //when
        inputView.getNumberOfGame();

        //then
        assertThat(inputView.getNumberOfGame()).isEqualTo(3);
    }

    @Test
    void inputNumberOfGameFailTest() {
        //given
        InputView inputView = new InputView(){
            @Override
            public String getString() {
                return "w";
            }
        };

        //when
        assertThatThrownBy(() -> {
            inputView.getNumberOfGame();

        }).isInstanceOf(IllegalStateException.class);
    }
}
