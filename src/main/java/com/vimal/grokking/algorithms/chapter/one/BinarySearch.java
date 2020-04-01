package com.vimal.grokking.algorithms.chapter.one;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    @Nullable
    public static Integer binarySearch(@NotNull final List<Integer> list, @NotNull final Integer item) {
        int low = 0;
        int high = list.size();

        while (low <= high) {
            int mid = (low + high) / 2;
            Integer guess = list.get(mid);

            if (guess.equals(item)) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 3, 5, 7, 9);
        System.out.println(binarySearch(myList, 3));
        System.out.println(binarySearch(myList, -1));
    }
}
