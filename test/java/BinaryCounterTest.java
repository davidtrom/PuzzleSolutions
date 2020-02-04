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
}