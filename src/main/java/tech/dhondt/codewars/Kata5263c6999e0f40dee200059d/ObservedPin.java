// https://www.codewars.com/kata/5263c6999e0f40dee200059d
package tech.dhondt.codewars.Kata5263c6999e0f40dee200059d;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

public class ObservedPin {
    public static List<String> getPINs(String observed) {
        if (observed.isEmpty()) return new ArrayList<>();
        List<String> res = asList("");
        for (int i = 0; i < observed.length(); i++) {
            List<String> adjacents = adjacent(observed.charAt(i));
            res = res.parallelStream().flatMap(c -> adjacents.stream().map(a -> c + a)).collect(toList());
        }
        return res;
    }

    private static List<String> adjacent(char number) {
        switch (number) {
            case '0': return asList("0", "8");
            case '1': return asList("1", "2", "4");
            case '2': return asList("1", "2", "3", "5");
            case '3': return asList("2", "3", "6");
            case '4': return asList("1", "4", "5", "7");
            case '5': return asList("2", "4", "5", "6", "8");
            case '6': return asList("3", "5", "6", "9");
            case '7': return asList("4", "7", "8");
            case '8': return asList("0", "5", "7", "8", "9");
            case '9': return asList("6", "8", "9");
            default: return emptyList();
        }
    }
}