package BalancedParens;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

import java.util.*;

// Feel free to make your own tests
public class SolutionTest {

    @Test
    public void testExample() {
        BalancedParens.balancedParens(5);
    }

    @Test
    public void testExample0() {
        List<String> warriorsList = new ArrayList<String>();
        //test for n = 0
        warriorsList = BalancedParens.balancedParens(0);
        assertEquals(new ArrayList<String>(Arrays.asList(new String[] {""}))
                ,  warriorsList
        );
    }

    @Test
    public void testExample1() {
        List<String> warriorsList = new ArrayList<String>();
        //test for n = 1
        warriorsList = BalancedParens.balancedParens(1);
        assertEquals(new ArrayList<String>(Arrays.asList(new String[]{"()"}))
                , warriorsList
        );
    }

    @Test
    public void testExample2() {
        List<String> warriorsList = new ArrayList<String>();

        //test for n =2
        warriorsList = BalancedParens.balancedParens(2);
        Collections.sort(warriorsList);
        assertEquals(new ArrayList<String>(Arrays.asList(new String[]{"(())", "()()"}))
                , warriorsList
        );
    }

    @Test
    public void testExample3() {
        List<String> warriorsList = new ArrayList<String>();

        //test for n = 3
        warriorsList = BalancedParens.balancedParens(3);
        Collections.sort(warriorsList);
        assertEquals(new ArrayList<String>(Arrays.asList(new String[]{"((()))", "(()())", "(())()", "()(())", "()()()"}))
                , warriorsList
        );
    }

    @Test
    public void testExample4() {
        List<String> warriorsList = new ArrayList<String>();

        //test for n = 4
        warriorsList = BalancedParens.balancedParens(4);
        Collections.sort(warriorsList);
        assertEquals(new ArrayList<String>(Arrays.asList(new String[]{"(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"}))
                , warriorsList
        );
    }

    @Test
    public void testExample5() {
        List<String> warriorsList = new ArrayList<String>();

        //test for n = 4
        warriorsList = BalancedParens.balancedParens(5);
        Collections.sort(warriorsList);
        assertEquals(new ArrayList<String>(Arrays.asList(new String[]{"(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"}))
                , warriorsList
        );
    }

    @Test
    public void testExample10() {
        List<String> warriorsList = new ArrayList<String>();

        //test for n = 4
        warriorsList = BalancedParens.balancedParens(10);
        Collections.sort(warriorsList);
        for (String s : warriorsList) {
            System.out.println(s);
        }
        assertEquals(new ArrayList<String>(Arrays.asList(new String[]{"(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"}))
                , warriorsList
        );
    }
}