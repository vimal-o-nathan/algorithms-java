package com.vimal.grokking.algorithms.chapter.three;

import com.vimal.grokking.algorithms.chapter.three.domain.Box;
import com.vimal.grokking.algorithms.chapter.three.domain.Item;
import com.vimal.grokking.algorithms.chapter.three.domain.Key;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Used for the exercise of searching through Grandma's boxes for a key
 */
public class SearchBox {

    public static void lookForKey(@NotNull final Box mainBox) {
        List<Item> pile = mainBox.makePileToLookThrough();

        while (!pile.isEmpty()) {
            Item item = pile.remove(0);
            if (item instanceof Box) {
                pile.add(item);
            } else if (item instanceof Key) {
                System.out.println("found the key");
                return;
            }
        }
    }
}
