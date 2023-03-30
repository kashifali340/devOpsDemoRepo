package com.devops.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

  @Test
  public void testAdd() {
    Calculator calculator = new Calculator();
    int result = calculator.add(2, 3);
    assertEquals(5, result);
  }
  
  @Test
  public void testSubtract() {
    Calculator calculator = new Calculator();
    int result = calculator.subtract(5, 3);
    assertEquals(2, result);
  }
  
  @Test
  public void testMultiply() {
    Calculator calculator = new Calculator();
    int result = calculator.multiply(2, 3);
    assertEquals(6, result);
  }
  
  @Test
  public void testDivide() {
    Calculator calculator = new Calculator();
    int result = calculator.divide(6, 3);
    assertEquals(2, result);
  }
  
  @Test
  public void testDivideByZero() {
    Calculator calculator = new Calculator();
    assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0));
  }
}
