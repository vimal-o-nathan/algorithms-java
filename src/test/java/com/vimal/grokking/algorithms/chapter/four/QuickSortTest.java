package com.vimal.grokking.algorithms.chapter.four;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.vimal.grokking.algorithms.chapter.four.QuickSort.quickSort;
import static org.junit.Assert.assertEquals;

public class QuickSortTest {

    @Test
    public void testSortEmptyList() {
        List<Integer> listToSort = Collections.emptyList();
        List<Integer> actual = quickSort(listToSort);

        assertEquals(listToSort, actual);
    }

    @Test
    public void testSortSingleItemList() {
        List<Integer> listToSort = Collections.singletonList(5);
        List<Integer> actual = quickSort(listToSort);

        assertEquals(listToSort, actual);
    }

    @Test
    public void testSortUnsortedList() {
        List<Integer> unsortedList = new ArrayList<>(Arrays.asList(10, 5, 2, 3));

        List<Integer> expected = Arrays.asList(2, 3, 5, 10);
        List<Integer> actual = quickSort(unsortedList);

        assertEquals(expected, actual);
    }
}
