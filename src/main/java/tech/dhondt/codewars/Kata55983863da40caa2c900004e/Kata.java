// https://www.codewars.com/kata/55983863da40caa2c900004e
package tech.dhondt.codewars.Kata55983863da40caa2c900004e;

import static java.util.Arrays.*;

public class Kata {
    public static long nextBiggerNumber(long n) {
        char[] inputChars = ((Long) n).toString().toCharArray();
        for (int i = inputChars.length - 1; i > 0; i--) { // go from right to left
            if (inputChars[i] > inputChars[i - 1]) {
                // if the current digit is higher the one before it, a permutation of
                // those 2 digits + the other ones on the right of it is possible, so that
                // the permutation will be greater than the current one.

                // pick the next highest digit from the the permutable digits
                char[] suffix = copyOfRange(inputChars, i--, inputChars.length);
                sort(suffix);
                int j = 0;
                while (suffix[j] <= inputChars[i]) j++;
                char diff = suffix[j];
                // diff is (from left to right) the first differing digit between input and output

                // sort all permutable digits (while skipping the one in diff) to form the smallest permutation
                boolean skipped = false;
                for (j = 0; j < inputChars.length - i; j++)
                    if (!skipped && inputChars[i + j] == diff) {
                        skipped = true;
                        i++;
                        j--;
                    } else
                        suffix[j] = inputChars[i + j];
                sort(suffix);

                // concatenate the unchanged part + diff + the smallest number that can be formed with the remaining digits
                return Long.parseLong(new String(copyOf(inputChars, --i)) + diff + new String(suffix));
            }
        }
        return -1L;
    }
}