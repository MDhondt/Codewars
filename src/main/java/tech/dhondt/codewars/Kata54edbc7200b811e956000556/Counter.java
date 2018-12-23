// https://www.codewars.com/kata/54edbc7200b811e956000556
package tech.dhondt.codewars.Kata54edbc7200b811e956000556;

import java.util.Objects;

import static java.util.Arrays.stream;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) stream(arrayOfSheeps).parallel()
                                          .filter(Objects::nonNull)
                                          .filter(x -> x)
                                          .count();
    }
}