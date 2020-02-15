import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToBinaryTest {
    private ConvertToBinary convertToBinaryTest;

    @BeforeEach
    void setUp() {
        convertToBinaryTest = new ConvertToBinary();
    }

    @Test
    void convertToBinary() {
        Long baseTen = 13L;
        Long expected = 1101L;
        Long actual = convertToBinaryTest.convertToBinary(baseTen);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convertToBinary2() {
        Long baseTen = 244L;
        Long expected = 11110100L;
        Long actual = convertToBinaryTest.convertToBinary(baseTen);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convertToBinary3() {
        Long baseTen = 2014L;
        Long expected = 11111011110L;
        Long actual = convertToBinaryTest.convertToBinary(baseTen);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convertToBinary4() {
        Long baseTen = 58L;
        Long expected = 111010L;
        Long actual = convertToBinaryTest.convertToBinary(baseTen);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convertToBinary5() {
        Long baseTen = 182L;
        Long expected = 10110110L;
        Long actual = convertToBinaryTest.convertToBinary(baseTen);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convertToBinary6() {
        Long baseTen = 3215L;
        Long expected = 110010001111L;
        Long actual = convertToBinaryTest.convertToBinary(baseTen);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convertToBinary7() {
        Long baseTen = 4268L;
        Long expected = 1000010101100L;
        Long actual = convertToBinaryTest.convertToBinary(baseTen);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void convertToBinary8() {
        Long baseTen = 1982L;
        Long expected = 11110111110L;
        Long actual = convertToBinaryTest.convertToBinary(baseTen);
        Assertions.assertEquals(expected, actual);
    }

}