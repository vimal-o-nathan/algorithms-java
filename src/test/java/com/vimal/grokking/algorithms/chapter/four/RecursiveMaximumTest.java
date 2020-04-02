package com.vimal.grokking.algorithms.chapter.four;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RecursiveMaximumTest {

    @Test
    public void testMaximumFirstElement() {
        List<Integer> list = Arrays.asList(8, 2, 3, 7);
        Integer expected = 8;
        Integer actual = RecursiveMaximum.findMaximum(list);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMaximumMiddleElement() {
        List<Integer> list = Arrays.asList(8, 2, 15, 3, 7);
        Integer expected = 15;
        Integer actual = RecursiveMaximum.findMaximum(list);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMaximumLastElement() {
        List<Integer> list = Arrays.asList(8, 2, 15, 3, 7, 37);
        Integer expected = 37;
        Integer actual = RecursiveMaximum.findMaximum(list);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMaximumSingleElement() {
        List<Integer> list = Collections.singletonList(5);
        Integer expected = 5;
        Integer actual = RecursiveMaximum.findMaximum(list);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMaximumEmptyList() {
        List<Integer> list = Collections.emptyList();
        Integer expected = null;
        Integer actual = RecursiveMaximum.findMaximum(list);

        Assert.assertEquals(expected, actual);
    }
}
