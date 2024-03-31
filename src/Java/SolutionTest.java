//
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//
//public class SolutionTest {
//
//    @Test
//    public void testLargeInput() {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 50000; i++) {
//            sb.append('A');
//            sb.append('B');
//        }
//        for (int i = 0; i < 50000; i++) {
//            sb.append('C');
//            sb.append('D');
//        }
//        String input = sb.toString();
//        assertEquals("", Main.solution(input));
//
//        String input2 = "ACBD" + input + "ACBD";
//        assertEquals("ACBDACBD", Main.solution(input2));
//    }
//
//    @Test
//    public void testLargeInput2() {
//        StringBuilder sb = new StringBuilder();
//        String input = "CBACD".repeat(250000);
//        String expected = "C".repeat(250000);
//        assertEquals(expected, Main.solution(input));
//    }
//
//    @Test
//    public void testLargeInput3() {
//        StringBuilder sb = new StringBuilder();
//        String input = "CABABD".repeat(250000);
//        assertEquals("", Main.solution(input));
//    }
//}
