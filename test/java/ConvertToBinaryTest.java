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
        Integer baseTen = 13;
        Integer expected = 1101;
        Integer actual = convertToBinaryTest.convertToBinary(baseTen);
        Assertions.assertEquals(expected, actual);
    }
}