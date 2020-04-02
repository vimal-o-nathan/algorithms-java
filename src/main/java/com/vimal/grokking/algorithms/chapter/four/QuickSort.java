package com.vimal.grokking.algorithms.chapter.four;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort {

    public QuickSort() {
        throw  new IllegalStateException("Do not instantiate");
    }

    @NotNull
    public static <X extends Comparable<X>> List<X> quickSort(@NotNull final List<X> unsortedList) {
        if (unsortedList.size() < 2) {
            return unsortedList;
        }

        return sortSizeGreaterThanTwo(unsortedList);
    }

    private static <X extends Comparable<X>> List<X> sortSizeGreaterThanTwo(@NotNull final List<X> unsortedList) {
        X pivot = unsortedList.remove(new Random().nextInt(unsortedList.size()));
        QuickSortSubListStruct<X> quickSortSubListStruct = createSubListStruct(unsortedList, pivot);

        List<X> sortedList = new ArrayList<>(quickSort(quickSortSubListStruct.getLessThanPivot()));
        sortedList.add(pivot);
        sortedList.addAll(quickSort(quickSortSubListStruct.getGreaterThanPivot()));

        return sortedList;
    }

    @NotNull
    private static <X extends Comparable<X>> QuickSort.QuickSortSubListStruct<X> createSubListStruct(
            @NotNull final List<X> unsortedList,
            @NotNull final X pivot
    ) {

        QuickSortSubListStruct<X> quickSortSubListStruct = new QuickSortSubListStruct<>();

        unsortedList.forEach(thisItem -> {
            if (thisItem.compareTo(pivot) < 0) {
                quickSortSubListStruct.getLessThanPivot().add(thisItem);
            } else {
                quickSortSubListStruct.getGreaterThanPivot().add(thisItem);
            }
        });
        return quickSortSubListStruct;
    }

    private static class QuickSortSubListStruct<X> {

        @NotNull final List<X> lessThanPivot;
        @NotNull final List<X> greaterThanPivot;

        public QuickSortSubListStruct() {
            lessThanPivot = new ArrayList<>();
            greaterThanPivot = new ArrayList<>();
        }

        @NotNull
        public List<X> getLessThanPivot() {
            return lessThanPivot;
        }

        @NotNull
        public List<X> getGreaterThanPivot() {
            return greaterThanPivot;
        }
    }
}
