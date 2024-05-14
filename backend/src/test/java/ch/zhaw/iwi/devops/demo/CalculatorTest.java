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
    @Test
    void testSubtract() {
    Calculator calc = new Calculator();
    Assertions.assertEquals(1, calc.subtract(3, 2), "3 - 2 sollte 1 ergeben");
}
@Test
void testAddPositiveNumbers() {
    Calculator calc = new Calculator();
    Assertions.assertEquals(20, calc.add(10, 10), "10 + 10 sollte 20 ergeben");
}
@Test
void testAddNegativeNumbers() {
    Calculator calc = new Calculator();
    Assertions.assertEquals(-20, calc.add(-10, -10), "-10 + -10 sollte -20 ergeben");
}
@Test
void testAddZero() {
    Calculator calc = new Calculator();
    Assertions.assertEquals(10, calc.add(10, 0), "10 + 0 sollte 10 ergeben");
}
@Test
    void testAddLargeNumbers() {
        Assertions.assertEquals(2147483647, calc.add(1073741823, 1073741824), "Testet die Addition von sehr großen Zahlen");
    }
    @Test
    void testAddWithNegativeResult() {
        Assertions.assertEquals(-5, calc.add(-10, 5), "-10 + 5 sollte -5 ergeben");
    }
    @Test
    void testAddWithZero() {
        Assertions.assertEquals(-10, calc.add(-10, 0), "-10 + 0 sollte -10 ergeben");
    }
    

    @Test
    void testSubtractPositiveNumbers() {
        Assertions.assertEquals(5, calc.subtract(10, 5), "10 - 5 sollte 5 ergeben");
    }
}
