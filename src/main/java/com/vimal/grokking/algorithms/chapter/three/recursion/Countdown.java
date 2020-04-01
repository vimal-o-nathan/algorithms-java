package com.vimal.grokking.algorithms.chapter.three.recursion;

public class Countdown {

    private Countdown() {
        throw new IllegalStateException("Do not instantiate this utility class!");
    }

    public static void countdown (final int numToCountDownFrom) {
        System.out.println(numToCountDownFrom);

        if (numToCountDownFrom <= 0) {
            return;
        } else {
            countdown(numToCountDownFrom - 1);
        }
    }

    public static void main(String[] args) {
        countdown(3);
    }
}
