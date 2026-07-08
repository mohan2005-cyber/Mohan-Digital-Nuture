package Exercise1;

import Exercise4.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise1 {
    @Test
    void exercise1(){
        Calculator calculator = new Calculator();
        assertEquals(132,calculator.multiply(12,11));
    }
}
