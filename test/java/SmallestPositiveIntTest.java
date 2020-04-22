import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestPositiveIntTest {
    private SmallestPositiveInt smallestPositiveInt;

    @BeforeEach
    void setUp() {
        smallestPositiveInt = new SmallestPositiveInt();
    }

    @Test
    void solution() {
        int [] test = new int[3];
        test[0] = 1;
        test[1] = 2;
        test[2] = 3;
        Assertions.assertEquals(4, smallestPositiveInt.solution(test));
    }

    @Test
    void solution2() {
        int [] test = new int[6];
        test[0] = 1;
        test[1] = 3;
        test[2] = 6;
        test[3] = 4;
        test[4] = 1;
        test[5] = 2;
        Assertions.assertEquals(5, smallestPositiveInt.solution(test));
    }

    @Test
    void solution3() {
        int [] test = new int[2];
        test[0] = -1;
        test[1] = -3;
        Assertions.assertEquals(1, smallestPositiveInt.solution(test));
    }

    @Test
    void solution4() {
        int [] test = new int[5];
        test[0] = 999995;
        test[1] = 999996;
        test[2] = 999997;
        test[3] = 999998;
        test[4] = 999999;
        Assertions.assertEquals(1000000, smallestPositiveInt.solution(test));
    }
}
