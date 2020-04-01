package com.vimal.grokking.algorithms.chapter.four;

public class EuclidsAlgorithm {

    private EuclidsAlgorithm() {
        throw new IllegalStateException("Do not instantiate this utility class");
    }

    public static int findGreatestCommonDivisor(final int a, final int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        if (a > b) {
            return findGreatestCommonDivisor(b, a%b);
        } else {
            return findGreatestCommonDivisor(a, b%a);
        }
    }
}
