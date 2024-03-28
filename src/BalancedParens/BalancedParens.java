package BalancedParens;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BalancedParens {
    public static List<String> balancedParens(int n) {
        List<String> parens = new ArrayList<>();
        if (n == 0) {
            return parens;
        }

        int anchor = n;
        int counterAnchor = 0;

        HashMap<Integer, String> parensMap = new HashMap<>();
//        while (n > counterAnchor) {
//
//            invadeParens(anchor, parensMap, 1);
//            invadeParens(counterAnchor, parensMap, 1);
//
//            parens.addAll(parensMap.values());
//            parensMap.clear();
//            anchor--;
//            counterAnchor++;
//        }

        if (n > 3) {
            innerParens2(n, parensMap, 2);
            parens.addAll(parensMap.values());
        }

        // your code here
        return parens;
    }

    private static void innerParens2(int n, HashMap<Integer, String> parensMap, int key) {
//        int outerParens = n;
//        while (outerParens > 0) {

            for (int i = 1; i < n; i++) {
                int outerParens = n - i;
                parensMap.put(key, "(".repeat(i));

                for (int innerParens = 1; innerParens < n; innerParens++) {
                    parensMap.put(key, "(".repeat(outerParens));
                    parensMap.put(key, parensMap.get(key) + "()".repeat(innerParens));
                    parensMap.put(key, parensMap.get(key) + ")".repeat(outerParens));
                    key++;
                    outerParens--;
                }

                parensMap.put(key, parensMap.get(key) + ")".repeat(i));
            }
//        }
    }

    private static void innerParens(int outerParens, int innerParens, HashMap<Integer, String> parensMap, int key) {
        parensMap.put(key, "(".repeat(outerParens));
        parensMap.put(key, parensMap.get(key) + "()".repeat(innerParens));
        parensMap.put(key, parensMap.get(key) + ")".repeat(outerParens));
    }

    private static void invadeParens(int n, HashMap<Integer, String> parensMap, int key) {
        if (n > 0) {
            parensMap.put(key, parensMap.getOrDefault(key, "") + "(");

//            inner parens like ((( [][] )))
//            if (n > 1) {
//                parensMap.put(key + 1, parensMap.get(key) + "()".repeat(n));
//                n = 0;
//            }

            invadeParens(n - 1, parensMap, key);
            parensMap.replace(key, parensMap.get(key) + ")");
        }
    }
}