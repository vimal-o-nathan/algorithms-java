package com.vimal.grokking.algorithms.chapter.two;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    private SelectionSort() {
        throw new IllegalStateException("Do not instantiate this utility class");
    }

    private static int findSmallest(@NotNull final List<Integer> list) {
        int smallest = list.get(0);
        int smallestIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    @NotNull
    public static List<Integer> selectionSort(@NotNull final List<Integer> list) {
        List<Integer> newList = new ArrayList<>();

        while (!list.isEmpty()) {
            int smallest = findSmallest(list);
            newList.add(list.remove(smallest));
        }

        return newList;
    }
}
