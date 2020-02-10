import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCFTest {
    GCF gcfTest;

    @BeforeEach
    void setUp() {
        gcfTest = new GCF();
    }

    @Test
    void findGCF() {
        Integer num1 = 8;
        Integer num2 = 16;
        Integer expected = 8;
        Integer actual = gcfTest.findGCF(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findGCF2() {
        Integer num1 = 24;
        Integer num2 = 3;
        Integer expected = 3;
        Integer actual = gcfTest.findGCF(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findGCF3() {
        Integer num1 = 36;
        Integer num2 = 60;
        Integer expected = 12;
        Integer actual = gcfTest.findGCF(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findGCF4() {
        Integer num1 = 7;
        Integer num2 = 10;
        Integer expected = 1;
        Integer actual = gcfTest.findGCF(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findGCF5() {
        Integer num1 = 50;
        Integer num2 = 40;
        Integer expected = 10;
        Integer actual = gcfTest.findGCF(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findGCF6() {
        Integer num1 = 75;
        Integer num2 = 30;
        Integer expected = 15;
        Integer actual = gcfTest.findGCF(num1, num2);
        Assertions.assertEquals(expected, actual);
    }
}