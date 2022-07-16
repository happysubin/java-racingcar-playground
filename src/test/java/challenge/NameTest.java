package challenge;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class NameTest {

    @Test
    void createName() {
        Name name = new Name("subin");

        assertThat(name.getName()).isEqualTo("subin");
    }
}
