package Exercise4;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise4 {
    private static Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    @AfterAll
    static void tearDown() {
        calculator=null;
        System.out.println("Tear Down");
    }
    @Test
    void test_addition() {
        assertEquals(20, calculator.add(4, 16));
        System.out.println("Testing addition");
    }
    @Test
    void test_subtraction() {
        assertEquals(5, calculator.subtract(51, 46));
        System.out.println("Testing Subtraction");
    }
    @Test
    void test_division() {
        assertEquals(40, calculator.divide(440, 11));
        System.out.println("Testing Division");
    }
    @Test
    void test_multiplication() {
        assertEquals(671, calculator.multiply(61, 11));
        System.out.println("Testing Multiplication");
    }
}
