package com.vimal.grokking.algorithms.chapter.two;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    private SelectionSort() {
        throw new IllegalStateException("Do not instantiate this utility class");
    }

    private static <X extends Comparable<X>> int findSmallest(@NotNull final List<X> list) {
        X smallest = list.get(0);
        int smallestIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(smallest) < 0) {
                smallest = list.get(i);
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    @NotNull
    public static <X extends Comparable<X>> List<X> selectionSort(@NotNull final List<X> list) {
        List<X> newList = new ArrayList<>();

        while (!list.isEmpty()) {
            int smallest = findSmallest(list);
            newList.add(list.remove(smallest));
        }

        return newList;
    }
}
