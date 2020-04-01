package com.vimal.grokking.algorithms.chapter.three.recursion;

public class Factorial {

    private Factorial() {
        throw new IllegalStateException("Do not instantiate this utility class");
    }

    public static int calculateFactorial(final int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * calculateFactorial(x-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(3));
    }
}
