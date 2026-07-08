package Exercise3;

import Exercise4.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise3 {
    @Test
    public void test(){
        assertEquals(10,10);
        assertNotNull(new Calculator());
        assertTrue(100 > 50);
        assertFalse(20 > 30);
        assertNull(null);
    }
}
