package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MathLibTest {
    @Test
    void testIsEven() {
        int value;
        assertTrue(MathLib.isEven(value=2));
        assertFalse(MathLib.isEven(value=3));
    }
}
