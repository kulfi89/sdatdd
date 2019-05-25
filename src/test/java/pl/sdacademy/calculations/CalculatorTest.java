package pl.sdacademy.calculations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  private Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void shouldAddTwoNumbers() {
    //given
    final double val1 = 3.2;
    final double val2 = 4.1;

    // when
    final double actualValue = calculator.add(val1, val2);

    //then
    assertEquals(7.3, actualValue);
  }

  @Test
  void shouldMultiplyTwoNumbers() {
    final double val1 = 2.0;
    final double val2 = 3.1;

    final double actualValue = calculator.multiply(val1, val2);

    assertEquals(6.2, actualValue);
  }

  @Test
  void shouldSubtractTwoNumbers() {
    final double val1 = 2.5;
    final double val2 = 3.8;

    final double actualValue = calculator.subtract(val1, val2);

    assertEquals(-1.3, actualValue, 0.1);
  }

  @Test
  void shouldAlwaysFail() {
    assertEquals(1, 2, "Jeden nie jest rowne dwa Panie!");
  }
}