package com.vimal.grokking.algorithms.chapter.four;

import org.junit.Assert;
import org.junit.Test;

import static com.vimal.grokking.algorithms.chapter.four.EuclidsAlgorithm.findGreatestCommonDivisor;

public class EuclidsAlgorithmTest {

    @Test
    public void testGCDFor270And192() {
        final int a = 270;
        final int b = 192;
        final int expected = 6;

        Assert.assertEquals(expected, findGreatestCommonDivisor(a, b));
    }

    @Test
    public void testGCDFor7And21() {
        final int a = 7;
        final int b = 21;
        final int expected = 7;

        Assert.assertEquals(expected, findGreatestCommonDivisor(a, b));
    }

    @Test
    public void testGCDFor1680And64() {
        final int a = 1680;
        final int b = 640;
        final int expected = 80;

        Assert.assertEquals(expected, findGreatestCommonDivisor(a, b));
    }
}
