package com.vimal.grokking.algorithms.chapter.two;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSortTest {

    @Test
    public void testSelectionSort() {
        List<Integer> unsortedList = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));

        List<Integer> expected = Arrays.asList(2, 3, 5, 6, 10);
        List<Integer> actual = SelectionSort.selectionSort(unsortedList);

        Assert.assertEquals(expected, actual);
    }
}
