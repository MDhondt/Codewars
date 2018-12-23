// https://www.codewars.com/kata/576b072359b1161a7b000a17
package tech.dhondt.codewars.Kata576b072359b1161a7b000a17;

public class PascalDiagonals {
    public static int[] generateDiagonal(int n, int l) {
        int[] diag = new int[l];
        if (l > 0) {
            diag[0] = 1;
        }
        for (int i = 1; i < l; i++) {
            diag[i] = diag[i - 1] * (n + i) / i;
        }
        return diag;
    }
}