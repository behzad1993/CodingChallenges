package RGB_To_Hex_Conversion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RgbToHexTest {

    @Test
    public void sampleTests1() {
        assertEquals("For input: (0, 0, 0)", "000000", RgbToHex.rgb(0, 0, 0));
    }

    @Test
    public void sampleTests2() {
        assertEquals("For input: (1, 2, 3)", "010203", RgbToHex.rgb(1, 2, 3));
    }

    @Test
    public void sampleTests3() {
        assertEquals("For input: (255, 255, 255)", "FFFFFF", RgbToHex.rgb(255, 255, 255));
    }

    @Test
    public void sampleTests4() {
        assertEquals("For input: (254, 253, 252)", "FEFDFC", RgbToHex.rgb(254, 253, 252));
    }

    @Test
    public void sampleTests5() {
        assertEquals("For input: (-20, 275, 125)", "00FF7D", RgbToHex.rgb(-20, 275, 125));
    }
}