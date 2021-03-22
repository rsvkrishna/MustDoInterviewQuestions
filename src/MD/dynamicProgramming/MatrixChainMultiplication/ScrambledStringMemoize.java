package MD.dynamicProgramming.MatrixChainMultiplication;

import java.util.HashMap;
import java.util.Map;

public class ScrambledStringMemoize {
    static Map<String, Boolean> mp;
    public static void main(String[] args) {
        System.out.println(isScramble("ABC", "CAB"));
        System.out.println(isScramble("great", "rgeat"));
        System.out.println(isScramble("abcde", "caebd"));
        System.out.println(isScramble("", ""));
    }
    public static boolean isScramble(String A, String B) {
        if (B.length() != A.length())
            return false;
        if (A.compareTo(B) == 0)
            return true;
        if (A.length()<=1)
            return false;
        if (A.length() == 0 || B.length() == 0)
            return false;
        /*if (A.length() == 0 && B.length() == 0)
            return true;*/
        return solve(A, B);
    }
    private static boolean solve(String A, String B) {
        mp=new HashMap<>();
        String key = A + ":" + B;

        if (mp.containsKey(key))
            return mp.get(key);

        if (A.compareTo(B) == 0) {
            mp.put(key, true);
            return true;
        }
        boolean scrambleStrings = false;
        int length = A.length();
        for (int i = 1; i < length; i++) {
            //swap || no swap
            if (    (solve(A.substring(0, i), B.substring(length - i)) &&
                    solve(A.substring(i, length), B.substring(0, length - i)))
                    ||
                    (solve(A.substring(0, i), B.substring(0, i)) &&
                            solve(A.substring(i, length), B.substring(i, length)))    ) {
                scrambleStrings = true;
                break;
            }
        }
        mp.put(key, scrambleStrings);
        return scrambleStrings;
    }
}
