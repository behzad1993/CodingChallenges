package Next_smaller_number;

import java.util.*;

public class Kata {
    public static long nextSmaller(long n) {

        if (n < 10) {
            return -1;
        }

        int[] nArray = String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .toArray();



        List<Integer> subNArray = createSublistFromArray(nArray, 1, nArray.length - 1);
        subNArray.sort(Collections.reverseOrder());

        return -1;
    }

    private static void sortList(ArrayList<Integer> intList) {
        intList.sort(Collections.reverseOrder());
    }

    private static List<Integer> createSublistFromArray(int[] intArray, int startIndex, int endIndex) {
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = startIndex; i <= endIndex; i++) {
            integerList.add(intArray[i]);
        }
        return integerList;
    }

    public static int createInteger(int[] digits) {
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        return number;
    }
}