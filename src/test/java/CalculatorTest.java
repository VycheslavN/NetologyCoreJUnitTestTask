import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Calculator tests started");
    }

    @BeforeEach
    public void beforeEach() {
        calculator = new Calculator();
        System.out.println("Calculator test started");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Calculator tests completed");
    }

    @AfterEach
    public void afterEach() {
        calculator = null;
        System.out.println("Calculator test completed");
    }

    @Test
    public void testAddition() {
        int a = 1, b = 2, expected = 3;
        int result = calculator.addition(a, b);
        assertEquals(expected, result);
    }
    @Test
    public void testSubtraction() {
        int a = 3, b = 2, expected = 1;
        int result = calculator.subtraction(a, b);
        assertEquals(expected, result);
    }
    @Test
    public void testMultiplication() {
        int a = 2, b = 2, expected = 4;
        int result = calculator.multiplication(a, b);
        assertEquals(expected, result);
    }
    @Test
    public void testDivision() {
        int a = 4, b = 2, expected = 2;
        int result = calculator.division(a, b);
        assertEquals(expected, result);
    }
}
