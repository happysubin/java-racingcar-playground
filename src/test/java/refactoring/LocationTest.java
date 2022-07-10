package refactoring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LocationTest {

    @Test
    @DisplayName("포지션 생성 테스트")
    void create(){
        Location position = new Location();
        int result = position.add();
        assertThat(result).isEqualTo(1);
    }
}
