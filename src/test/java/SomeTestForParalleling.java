import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomeTestForParalleling {
    @Test
    public void parallelTest() {
        // Тест чтобы тупа в параллели крутился!
        int a = 1;
        int b = 5;
        int sum = a + b;
        Assertions.assertEquals(6, sum, "Не получилось что то");
    }
}
