package amazon1;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void test1() {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(5);
        integers.add(2);
        integers.add(4);
        integers.add(3);
        integers.add(1);
        integers.add(6);
        int minNumMoves = Result.getMinNumMoves(integers);
        System.out.println("Result " + minNumMoves);
    }

    @Test
    void test2() {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(4);
        integers.add(3);
        integers.add(6);
        int minNumMoves = Result.getMinNumMoves(integers);
        System.out.println("Result " + minNumMoves);
    }

    @Test
    void test3() {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(4);
        integers.add(11);
        integers.add(9);
        integers.add(10);
        integers.add(12);
        int minNumMoves = Result.getMinNumMoves(integers);
        System.out.println("Result " + minNumMoves);
    }
}
