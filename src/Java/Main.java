import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String solution = solution(5, 0, 2);
        System.out.println(solution);
        System.out.println(!containsCharThreeTimesInARow(solution));
        System.out.println();

        solution = solution(1, 2, 1);
        System.out.println(solution);
        System.out.println(!containsCharThreeTimesInARow(solution));
        System.out.println();

        solution = solution(0, 2, 0);
        System.out.println(solution);
        System.out.println(!containsCharThreeTimesInARow(solution));
        System.out.println();

        solution = solution(0, 0, 10);
        System.out.println(solution);
        System.out.println(!containsCharThreeTimesInARow(solution));
        System.out.println();

        solution = solution(3, 3, 3);
        System.out.println(solution);
        System.out.println(!containsCharThreeTimesInARow(solution));
        System.out.println();

        solution = solution(0,0,0);
        System.out.println(solution);
        System.out.println(!containsCharThreeTimesInARow(solution));
        System.out.println();

        solution = solution(9,7,8);
        System.out.println(solution);
        System.out.println(!containsCharThreeTimesInARow(solution));
        System.out.println();


//        System.out.println(solution("CBACD"));
//        System.out.println(solution("CABABD"));
//        System.out.println(solution("ACBDACBD"));
    }

//    public static String solution(String s) {
//        List<String> patternList = Arrays.asList("AB", "BA", "CD", "DC");
//        boolean couldDelete = true;
//        while (couldDelete) {
//            couldDelete = false;
//            int sSizeBefore = s.length();
//            for (String pattern : patternList) {
//                s = saerch(s, pattern);
//            }
//            if (sSizeBefore > s.length()) {
//                couldDelete = true;
//            }
//        }
//        return s;
//    }
//
//    private static String saerch(String s, String pattern) {
//        return s.replace(pattern, "");
//    }
//}

    public static String solution(int AA, int AB, int BB) {
        // Implement your solution here
        if (AA == 0 && AB == 0 && BB == 0) {
                return "";
        }

        StringBuilder sb = new StringBuilder();
        String prev = "";
        boolean couldAdd = true;
        while (couldAdd) {
            couldAdd = false;

            // the only case which has to be done if the condition is true
            if (prev.equals("AA") && BB > 0) {
                sb.append("BB");
                BB -= 1;
                prev = "BB";
                couldAdd = true;
                continue;
            }

            // the next three cases are simply conditions written down from a condition table
            if (AA > BB && AA >= AB && !prev.equals("AA") && AA > 0) {
                sb.append("AA");
                AA -= 1;
                prev = "AA";
                couldAdd = true;
                continue;
            }

            if (BB > 0 && BB > AA && BB > AB && (prev.equals("AA") || prev.isEmpty())) {
                sb.append("BB");
                BB -= 1;
                prev = "BB";
                couldAdd = true;
                continue;
            }

            if (AB > 0 && AB > AA && AB > BB && !prev.equals("AA")) {
                sb.append("AB");
                AB -= 1;
                prev = "AB";
                couldAdd = true;
            }

            if (AA == AB && AB == BB && AA > 0) {
                switch (prev) {
                    case "AA":
                        sb.append("BB");
                        BB -= 1;
                        prev = "BB";
                        couldAdd = true;
                        break;
                    case "AB":
                        sb.append("AA");
                        AA -= 1;
                        prev = "AA";
                        couldAdd = true;
                        break;
                    case "BB":
                        sb.append("AA");
                        AA -= 1;
                        prev = "AA";
                        couldAdd = true;
                        break;
                    default:
                        sb.append("AA");
                        AA -= 1;
                        prev = "AA";
                        couldAdd = true;
                        break;
                }

            }
        }
        return sb.toString();
    }


//    public static String solution(int AA, int AB, int BB) {
//        // Implement your solution here
//        StringBuilder sb = new StringBuilder();
//        String prev = "";
//        boolean couldAdd = true;
//        while (couldAdd) {
//
////            if (AA == 0 && AB == 0 && BB == 0) {
////                return "";
////            }
//
//            couldAdd = false;
//            if (prev.equals("AA") && BB > 0) {
//                sb.append("BB");
//                BB -= 1;
//                prev = "BB";
//                couldAdd = true;
//                continue;
//            }
//
//            if (prev.equals("AB") && AB > 0) {
//                sb.append("AB");
//                AB -= 1;
//                prev = "AB";
//                couldAdd = true;
//                continue;
//            }
//
//            if (AA > 0 && AA > BB && AA > AB && !prev.equals("AA")) {
//                sb.append("AA");
//                AA -= 1;
//                prev = "AA";
//                couldAdd = true;
//                continue;
//            }
//
//            if (BB > 0 && BB > AA && BB > AB && (prev.equals("AA") || prev.isEmpty())) {
//                sb.append("BB");
//                BB -= 1;
//                prev = "BB";
//                couldAdd = true;
//                continue;
//            }
//
//            if (AB > 0 && AB > AA && AB > BB && !prev.equals("AA")) {
//                sb.append("AB");
//                AB -= 1;
//                prev = "AB";
//                couldAdd = true;
//                continue;
//            }
//
//            if (AA == AB && AB == BB && AA > 0) {
//                switch (prev) {
//                    case "AA":
//                        sb.append("BB");
//                        BB -= 1;
//                        prev = "BB";
//                        couldAdd = true;
//                        break;
//                    case "AB":
//                        sb.append("AA");
//                        AA -= 1;
//                        prev = "AA";
//                        couldAdd = true;
//                        break;
//                    case "BB":
//                        sb.append("AA");
//                        AA -= 1;
//                        prev = "AA";
//                        couldAdd = true;
//                        break;
//                    default:
//                        sb.append("AA");
//                        AA -= 1;
//                        prev = "AA";
//                        couldAdd = true;
//                        break;
//                }
//
//            }
//        }
//        return sb.toString();
//    }

    public static boolean containsCharThreeTimesInARow(String input) {
        if (input == null || input.length() < 3) {
            return false;
        }

        char[] chars = input.toCharArray();
        char prevChar = chars[0];
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == prevChar) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                prevChar = chars[i];
                count = 1;
            }
        }

        return false;
    }
}










//
//public class Main {
//    public static void main(String[] args) {
//        solution(54321);
//        System.out.println();
//        solution(123456789);
//        System.out.println();
//        solution(10011);
//        System.out.println();
//        solution(123450);
//        System.out.println();
////        solution(0123450);
//        System.out.println();
//        solution(1);
//        System.out.println();
//        solution(0);
//        System.out.println();
//    }

//    public static void solution(int N) {
//        while (N > 0) {
//            int enable_print = N % 10;
//            if (enable_print != 0) {
//                enable_print = 1;
//            }
//            if (enable_print == 1) {
//                System.out.print(N % 10);
//            }
//            N = N / 10;
//        }
//    }

//    public static void solution(int N) {
//        int enable_print = 0;
//        while (N > 0) {
//            if (enable_print == 0 && N % 10 != 0) {
//                enable_print = 1;
//            }
//            if (enable_print == 1) {
//                System.out.print(N % 10);
//            }
//            N = N / 10;
//        }
//    }


//    public static void solution(int N) {
//        int enable_print = N % 10;
//        while (N > 0) {
//            if (enable_print == 0 && N % 10 != 0) {
//                enable_print = 1;
//            }
//            else {
//                System.out.print(N % 10);
//            }
//            N = N / 10;
//        }
//        System.out.println();
//    }
//}