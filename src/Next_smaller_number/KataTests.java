package Next_smaller_number;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class KataTests {
    @Test
    public void basicTests() {
        assertEquals(12, Kata.nextSmaller(21));
    }

    @Test
    public void basicTests2() {
        assertEquals(790, Kata.nextSmaller(907));
    }

    @Test
    public void basicTests3() {
        assertEquals(513, Kata.nextSmaller(531));
    }

    @Test
    public void basicTests4() {
        assertEquals(-1, Kata.nextSmaller(1027));
    }

    @Test
    public void basicTests5() {
        assertEquals(414, Kata.nextSmaller(441));
    }

    @Test
    public void basicTests6() {
        assertEquals(123456789, Kata.nextSmaller(123456798));
    }
}