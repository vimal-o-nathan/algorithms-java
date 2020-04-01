package com.vimal.grokking.algorithms.chapter.one;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BinarySearch {

    @Nullable
    public static Integer binarySearch(@NotNull final int[] list, final int item) {
        int low = 0;
        int high = list.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess == item) {
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
        int[] myList = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(myList, 3));
        System.out.println(binarySearch(myList, -1));
    }
}
