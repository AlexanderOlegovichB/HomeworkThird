import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class TestParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Первый", "Второй", "Третий"})
    void parametrizedTest (String strings) {
        Assertions.assertFalse(strings.isEmpty(), "Пусто");
    }
}
