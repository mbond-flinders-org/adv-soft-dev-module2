package module2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoNumbers() {
        // Arrange
        Calculator calc = new Calculator();

        // Act
        double result = calc.add(10, 50);

        // Assert  (expected, actual, delta)
        assertEquals(60, result, 0.0001);
    }

    @Test
    void subtractTwoNumbers() {
        Calculator calc = new Calculator();

        double result = calc.subtract(10, 50);

        assertEquals(-40, result, 0.0001);
    }

    @Test
    void divideByZeroThrowsException() {
        Calculator calc = new Calculator();

        // Passes only if the code inside the lambda throws this exception type
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }
}
