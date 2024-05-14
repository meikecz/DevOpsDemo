package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
Calculator calc = new Calculator();
int result = calc.add(1, 2); // Correctly calling add on a Calculator instance

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(5, ((Calculator) calc).add(2, 3), "2 + 3 sollte 5 ergeben");
    }
}
