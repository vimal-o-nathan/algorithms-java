package com.vimal.grokking.algorithms.chapter.three.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item {

    private List<Item> itemsInBox;

    public List<Item> makePileToLookThrough() {
        return new ArrayList<>(itemsInBox);
    }

    public void setItemsInBox(List<Item> itemsInBox) {
        this.itemsInBox = itemsInBox;
    }
}
