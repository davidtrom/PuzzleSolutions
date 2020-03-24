import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringsCertainLengthOrderedTest {
    private SubstringsCertainLengthOrdered substrings;

    @BeforeEach
    void setUp() {
        substrings = new SubstringsCertainLengthOrdered();
    }

    @Test
    void getSmallestAndLargest() {
        String expected = "ava" + "\n" + "wel";
        String s="welcometojava";
        int k = 3;
        String actual = substrings.getSmallestAndLargest(s, k);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSmallestAndLargest2() {
        String expected = "arle" + "\n" + "ydav";
        String s="harleydavidson";
        int k = 4;
        String actual = substrings.getSmallestAndLargest(s, k);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSmallestAndLargest3() {
        String expected = "al" + "\n" + "ya";
        String s="robinkgoyal";
        int k = 2;
        String actual = substrings.getSmallestAndLargest(s, k);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSmallestAndLargest4() {
        String expected = "Kg" + "\n" + "ya";
        String s="RobinKgoyal";
        int k = 2;
        String actual = substrings.getSmallestAndLargest(s, k);
        Assertions.assertEquals(expected, actual);
    }
}