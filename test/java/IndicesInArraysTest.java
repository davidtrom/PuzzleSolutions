import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IndicesInArraysTest {
    private IndicesInArrays indicesInArraysTest;

    @BeforeEach
    void setUp() {
        indicesInArraysTest = new IndicesInArrays();
    }

    @Test
    void findAtIndex() {
        Integer [] indices = new Integer[] {3, 2, 4, 8};
        Integer [] numbersArray = new Integer[] {18, 15, 12, 9, 2, 22, 25, 29, 31};
        ArrayList<Integer> expected = new ArrayList<>(List.of(12, 18, 31));
        ArrayList<Integer> actual = indicesInArraysTest.findAtIndex(indices, numbersArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAtIndex2() {
        Integer [] indices = new Integer[] {3, 2, 4, 8};
        Integer [] numbersArray = new Integer[] {18, 15, 12, 9, 2, 22, 25, 29, 31};
        ArrayList<Integer> expected = new ArrayList<>(List.of(12, 18, 31));
        ArrayList<Integer> actual = indicesInArraysTest.findAtIndex(indices, numbersArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAtIndex3() {
        Integer [] indices = new Integer[] {3, 2, 4, 8};
        Integer [] numbersArray = new Integer[] {18, 15, 12, 9, 2, 22, 25, 29, 31};
        ArrayList<Integer> expected = new ArrayList<>(List.of(12, 18, 31));
        ArrayList<Integer> actual = indicesInArraysTest.findAtIndex(indices, numbersArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAtIndex4() {
        Integer [] indices = new Integer[] {3, 2, 4, 8};
        Integer [] numbersArray = new Integer[] {18, 15, 12, 9, 2, 22, 25, 29, 31};
        ArrayList<Integer> expected = new ArrayList<>(List.of(12, 18, 31));
        ArrayList<Integer> actual = indicesInArraysTest.findAtIndex(indices, numbersArray);
        Assertions.assertEquals(expected, actual);
    }
}