import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesisTest {
    private BalancedParenthesis balancedParenthesisTest;

    @BeforeEach
    void setUp() {
        balancedParenthesisTest = new BalancedParenthesis();
    }

    @Test
    void checkIfBalanced() {
        Integer expected = 1;
        String checkString = "(())()()((()))";
        Integer actual = balancedParenthesisTest.checkIfBalanced(checkString);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkIfBalanced2() {
        Integer expected = 0;
        String checkString = ")(";
        Integer actual = balancedParenthesisTest.checkIfBalanced(checkString);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkIfBalanced3() {
        Integer expected = 0;
        String checkString = ")))(((";
        Integer actual = balancedParenthesisTest.checkIfBalanced(checkString);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkIfBalanced4() {
        Integer expected = 0;
        String checkString = "(()))";
        Integer actual = balancedParenthesisTest.checkIfBalanced(checkString);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkIfBalanced5() {
        Integer expected = 0;
        String checkString = "((()))(";
        Integer actual = balancedParenthesisTest.checkIfBalanced(checkString);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkIfBalanced6() {
        Integer expected = 1;
        String checkString = "((()))()(()(()()))";
        Integer actual = balancedParenthesisTest.checkIfBalanced(checkString);
        Assertions.assertEquals(expected, actual);
    }

}