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

    @Test
    void findLCM3() {
        Integer num1 = 6;
        Integer num2 = 42;
        Integer expected = 42;
        Integer actual = lcmTest.findLCM(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findLCM4() {
        Integer num1 = 7;
        Integer num2 = 15;
        Integer expected = 105;
        Integer actual = lcmTest.findLCM(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findLCM5() {
        Integer num1 = 12;
        Integer num2 = 18;
        Integer expected = 36;
        Integer actual = lcmTest.findLCM(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findLCM6() {
        Integer num1 = 3;
        Integer num2 = 31;
        Integer expected = 93;
        Integer actual = lcmTest.findLCM(num1, num2);
        Assertions.assertEquals(expected, actual);
    }
}