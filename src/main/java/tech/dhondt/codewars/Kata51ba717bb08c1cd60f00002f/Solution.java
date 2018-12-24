// http://www.codewars.com/kata/51ba717bb08c1cd60f00002f
package tech.dhondt.codewars.Kata51ba717bb08c1cd60f00002f;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.join;
import static java.util.Arrays.sort;

public class Solution {
    public static String rangeExtraction(int[] arr) {
        List<String> result = new ArrayList<>();
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int j;
            boolean range = false;
            for (j = i + 1; j < arr.length; j++) {
                if ((j == i + 1 && arr[i] == arr[j] - 1) || (arr[j] == arr[j - 1] + 1)) {
                    range = true;
                } else {
                    break;
                }
            }
            if (range && j - i > 2) {
                result.add(arr[i] + "-" + (arr[i] + j - i - 1));
                i += j - i - 1;
            } else {
                result.add("" + arr[i]);
            }
        }
        return join(",", result);
    }
}