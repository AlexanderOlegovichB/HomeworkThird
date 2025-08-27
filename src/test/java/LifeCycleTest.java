import org.junit.jupiter.api.*;

public class LifeCycleTest {

    @BeforeAll
    public static void beforeAllTipa() {
        System.out.println("Перед всеми будет вот это");
    }

    @BeforeEach
    public void beforeEachTipa() {
        System.out.println("Перед каждым будет вот это");
    }

    @Test
    public void testCalculations() {
        //    Первый тест
        int a = 1;
        int b = 2;
        int sum = a + b;
        Assertions.assertEquals(3, sum, "Оказывается можно добавить описание проверки");
    }


    @Test
    public void testTrueFalse() {
        //    Тест на фолс
        String string = "Запись";
        Assertions.assertFalse(string.isEmpty(), "Пусто");
    }


    @Test
    public void testNotNull() {
        //    Тест на налл
        Integer integer = 4;
        Assertions.assertNotNull(integer, "Опа, налл");
    }



    @Test
    public void testTrue() {
        // АссертТру что Биба это Биба
        String s = "Биба";
        Assertions.assertTrue(s.equals("Биба"), "Это не Биба");
    }

    @Test
    public void testThrows() {
        // тест из за которого пришлось заново учить
        Assertions.assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Выведем после всех");
    }

    @AfterEach
    public void afterEachTipa() {
        System.out.println("Выведем после каждого");
    }
}