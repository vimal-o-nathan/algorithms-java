package com.vimal.grokking.algorithms.chapter.one;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.vimal.grokking.algorithms.chapter.one.BinarySearch.binarySearch;

public class BinarySearchTest {

    @Test
    public void searchForElementAtIndex1() {
        List<Integer> myList = Arrays.asList(1, 3, 5, 7, 9);
        Integer expected = 1;
        Integer actual = binarySearch(myList, 3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchForElementNotPresent() {
        List<Integer> myList = Arrays.asList(1, 3, 5, 7, 9);
        Integer expected = null;
        Integer actual = binarySearch(myList, -1);

        Assert.assertEquals(expected, actual);
    }
}
