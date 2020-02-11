package Factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    Factorial factorialTest;

    @BeforeEach
    void setUp() {
        factorialTest = new Factorial();
    }

    @Test
    void findFactorial() {
        Integer num = 7;
        Integer expected = 5040;
        Integer actual = factorialTest.findFactorial(num);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findFactorial2() {
        Integer num = 10;
        Integer expected = 3628800;
        Integer actual = factorialTest.findFactorial(num);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findFactorial3() {
        Integer num = 0;
        Integer expected = 1;
        Integer actual = factorialTest.findFactorial(num);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findFactorial4() {
        Integer num = -5;
        Exception expected = new NegativeFactorialException();
        Integer actual = factorialTest.findFactorial(num);
        //Assertions.assertThrows(NegativeFactorialException.class,() -> factorialTest.findFactorial(num));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findFactorial5() {
        Integer num = 12;
        Integer expected = 479001600;
        Integer actual = factorialTest.findFactorial(num);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findFactorial6() {
        Integer num = 4;
        Integer expected = 24;
        Integer actual = factorialTest.findFactorial(num);
        Assertions.assertEquals(expected, actual);
    }
}