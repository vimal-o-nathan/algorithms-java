package com.vimal.grokking.algorithms.chapter.one;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BinarySearch {

    @Nullable
    public static <X extends Comparable<X>> Integer binarySearch(@NotNull final List<X> list, final X item) {
        int low = 0;
        int high = list.size();

        while (low <= high) {
            int mid = (low + high) / 2;
            X guess = list.get(mid);

            if (guess.equals(item)) {
                return mid;
            } else if (guess.compareTo(item) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }
}
