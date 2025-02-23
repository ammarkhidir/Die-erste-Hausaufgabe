package htw.berlin.prog2.ha1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Retro calculator")
class CalculatorTest {

    @Test
    @DisplayName("should display result after adding two positive multi-digit numbers")
    void testPositiveAddition() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressBinaryOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressEqualsKey();

        String expected = "40";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should display result after getting the square root of two")
    void testSquareRoot() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressUnaryOperationKey("√");

        String expected = "1.41421356";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }
// here where I begin
@Test
@DisplayName("should display result after getting the percentage % of number 10 ")
void testPercentage() {
    Calculator calc = new Calculator();

    calc.pressDigitKey(1);
    calc.pressDigitKey(0);
    calc.pressUnaryOperationKey("%");

    String expected = "0.1";
    String actual = calc.readScreen();

    assertEquals(expected, actual);
}
    @Test
    @DisplayName("should display result of the addition of two negative numbers ")
    void testNegative() {
        Calculator calc = new Calculator();

        calc.pressNegativeKey();
        calc.pressDigitKey(7);
        calc.pressBinaryOperationKey("+");
        calc.pressNegativeKey();
        calc.pressDigitKey(2);
        calc.pressEqualsKey();

        String expected = "-9";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Divided by zero")
    void testDividedByZero() {
        Calculator calc = new Calculator();


        calc.pressDigitKey(2);
        calc.pressBinaryOperationKey("/");
        calc.pressDigitKey(0);
        calc.pressEqualsKey();

        String expected = "Error";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }
}

