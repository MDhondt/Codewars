// https://www.codewars.com/kata/576bb71bbbcf0951d5000044
package tech.dhondt.codewars.Kata576bb71bbbcf0951d5000044;

import static java.util.stream.IntStream.of;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        return new int[] {
                (int)of(input).filter(i -> i > 0).count(),
                of(input).filter(i -> i < 0).sum()
        };
    }
}