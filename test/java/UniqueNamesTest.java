import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNamesTest {
    UniqueNames uniqueUserNamesTest;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        uniqueUserNamesTest = new UniqueNames();
        //String [] userNames = new String[] {"bob", "samantha", "bob", "robert", "sarah", "sarah", "bob"};
    }

    @org.junit.jupiter.api.Test
    void uniqueUserNames() {
        String [] userNames = new String[] {"bob", "samantha", "bob", "robert", "sarah", "sarah", "bob"};
        String [] expected = new String[7] ;
        expected[0]="bob";
        expected[1]="samantha";
        expected[2]="bob1";
        expected[3]="robert";
        expected[4]="sarah";
        expected[5]="sarah1";
        expected[6]="bob2";
        String [] actual = uniqueUserNamesTest.uniqueUserNames(userNames);
        Assertions.assertArrayEquals(expected, actual);
        //Assertions.assertEquals(expected, actual);
    }
}