import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {
    private Anagrams anagramsTest;

    @BeforeEach
    void setUp() {
        anagramsTest = new Anagrams();
    }

    @Test
    void anagramCheck() {
        String a = "cat";
        String b = "act";
        Boolean expected = true;
        Boolean actual = anagramsTest.anagramCheckStream(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void anagramCheck2() {
        String a = "generics";
        String b = "eriengcs";
        Boolean expected = true;
        Boolean actual = anagramsTest.anagramCheckStream(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void anagramCheck3() {
        String a = "nickel";
        String b = "dime";
        Boolean expected = false;
        Boolean actual = anagramsTest.anagramCheckStream(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void anagramCheck4() {
        String a = "supercalifragilous";
        String b = "caliilousfragrepus";
        Boolean expected = true;
        Boolean actual = anagramsTest.anagramCheckStream(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void anagramCheck5() {
        String a = "John";
        String b = "Dave";
        Boolean expected = false;
        Boolean actual = anagramsTest.anagramCheckStream(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void anagramCheck6() {
        String a = "Timothy";
        String b = "Reginold";
        Boolean expected = false;
        Boolean actual = anagramsTest.anagramCheckStream(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void anagramCheck7() {
        String a = "cat";
        String b = "act";
        Boolean expected = true;
        Boolean actual = anagramsTest.anagramCheckArray(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void anagramCheck8() {
        String a = "generics";
        String b = "eriengcs";
        Boolean expected = true;
        Boolean actual = anagramsTest.anagramCheckArray(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void anagramCheck9() {
        String a = "nickel";
        String b = "dime";
        Boolean expected = false;
        Boolean actual = anagramsTest.anagramCheckArray(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void anagramCheck10() {
        String a = "supercalifragilous";
        String b = "caliilousfragrepus";
        Boolean expected = true;
        Boolean actual = anagramsTest.anagramCheckArray(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void anagramCheck11() {
        String a = "John";
        String b = "Dave";
        Boolean expected = false;
        Boolean actual = anagramsTest.anagramCheckArray(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void anagramCheck12() {
        String a = "Timothy";
        String b = "Reginold";
        Boolean expected = false;
        Boolean actual = anagramsTest.anagramCheckArray(a, b);
        Assertions.assertEquals(expected, actual);
    }
}