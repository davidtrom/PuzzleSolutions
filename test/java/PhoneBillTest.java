import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBillTest {
    PhoneBill phoneBill;

    @BeforeEach
    void setUp() {
        phoneBill = new PhoneBill();
    }

    @Test
    void solution() {
        String input = "00:01:07,400-234-090\n00:05:01,701-080-080\n00:05:00,400-234-090";
        phoneBill.solution(input);
    }
}