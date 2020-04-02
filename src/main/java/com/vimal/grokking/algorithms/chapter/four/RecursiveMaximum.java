package com.vimal.grokking.algorithms.chapter.four;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RecursiveMaximum {

    private RecursiveMaximum() {
        throw new IllegalStateException("Do not instantiate");
    }

    @Nullable
    public static <X extends Comparable> X findMaximum(@NotNull final List<X> list) {
        if (list.isEmpty()) {
            return null;
        } else if (list.size() == 1) {
            return list.get(0);
        }

        X firstInList = list.get(0);
        X subListMax = findMaximum(list.subList(1, list.size()));
        if (firstInList.compareTo(subListMax) > 0) {
            return firstInList;
        }

        return subListMax;
    }
}
