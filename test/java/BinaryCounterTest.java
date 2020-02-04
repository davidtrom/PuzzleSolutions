import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryCounterTest {
    private BinaryCounter binaryCounterTest;

    @BeforeEach
    void setUp() {
        binaryCounterTest = new BinaryCounter();
    }

    @Test
    void binaryOnesCounter() {
        Integer numToTest = 13;
        Integer expected = 3;
        Integer actual = binaryCounterTest.binaryOnesCounter(numToTest);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void binaryOnesCounter2() {
        Integer numToTest = 64;
        Integer expected = 1;
        Integer actual = binaryCounterTest.binaryOnesCounter(numToTest);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void binaryOnesCounter3() {
        Integer numToTest = 14;
        Integer expected = 3;
        Integer actual = binaryCounterTest.binaryOnesCounter(numToTest);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void binaryOnesCounter4() {
        Integer numToTest = 30;
        Integer expected = 4;
        Integer actual = binaryCounterTest.binaryOnesCounter(numToTest);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void binaryOnesCounter5() {
        Integer numToTest = 100;
        Integer expected = 3;
        Integer actual = binaryCounterTest.binaryOnesCounter(numToTest);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void binaryOnesCounter6() {
        Integer numToTest = 75;
        Integer expected = 4;
        Integer actual = binaryCounterTest.binaryOnesCounter(numToTest);
        Assertions.assertEquals(expected, actual);
    }
}