package amazon1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getMinNumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY blocks as parameter.
     */

    public static int getMinNumMoves(List<Integer> blocks) {

        List.of(1, 2, 3);
        // Write your code here
        int minIndex = 0;
        int maxIndex = 0;
        System.out.println(blocks.toString());
        // Find the index of the minimum and maximum values
        for (int i = 1; i < blocks.size(); i++) {
            if (blocks.get(i) < blocks.get(minIndex)) {
                minIndex = i;
            } else if (blocks.get(i) > blocks.get(maxIndex)) {
                maxIndex = i;
            }
        }
        System.out.println("MIN: " + minIndex);
        System.out.println("MAX: " + maxIndex);
        System.out.println(blocks.size());
        if (minIndex == 0 && maxIndex == blocks.size()-1) {
            return 0;
        }

        if (minIndex > maxIndex) {
            return minIndex + Math.abs(maxIndex - (blocks.size() - 1)) - 1;
        } else {
            return minIndex + Math.abs(maxIndex - (blocks.size() - 1));
        }
    }
}