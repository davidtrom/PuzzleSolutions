import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCMTest {
    private LCM lcmTest;

    @BeforeEach
    void setUp() {
        lcmTest = new LCM();
    }

    @Test
    void findLCM() {
        Integer num1 = 9;
        Integer num2 = 8;
        Integer expected = 72;
        Integer actual = lcmTest.findLCM(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findLCM2() {
        Integer num1 = 25;
        Integer num2 = 5;
        Integer expected = 25;
        Integer actual = lcmTest.findLCM(num1, num2);
        Assertions.assertEquals(expected, actual);
    }
}