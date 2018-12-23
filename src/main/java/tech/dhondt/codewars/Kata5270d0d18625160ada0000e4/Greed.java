// https://www.codewars.com/kata/5270d0d18625160ada0000e4
package tech.dhondt.codewars.Kata5270d0d18625160ada0000e4;

public class Greed{
    public static int greedy(int[] dice) {
        int nb1, nb2, nb3, nb4, nb5, nb6, res;
        nb1 = nb2 = nb3 = nb4 = nb5 = nb6 = res = 0;

        for (int i = 0; i < 5; i++) {
            if (dice[i] == 1) nb1++;
            else if (dice[i] == 2) nb2++;
            else if (dice[i] == 3) nb3++;
            else if (dice[i] == 4) nb4++;
            else if (dice[i] == 5) nb5++;
            else if (dice[i] == 6) nb6++;
        }

        if (nb1 >= 3) res += 1000;
        else if (nb6 >= 3) res += 600;
        else if (nb5 >= 3) res += 500;
        else if (nb4 >= 3) res += 400;
        else if (nb3 >= 3) res += 300;
        else if (nb2 >= 3) res += 200;
        res += 100 * (nb1 >= 3 ? nb1 - 3 : nb1);
        res += 50 * (nb5 >= 3 ? nb5 - 3 : nb5);

        return res;
    }
}