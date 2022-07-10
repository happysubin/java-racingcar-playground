package refactoring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class NameTest {

    @Test
    void create() {
        String str = "subin";
        Name name = new Name(str);

        assertThat(name.getName()).isEqualTo("subin");

    }
}
