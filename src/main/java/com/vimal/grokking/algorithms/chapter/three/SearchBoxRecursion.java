package com.vimal.grokking.algorithms.chapter.three;

import com.vimal.grokking.algorithms.chapter.three.domain.Box;
import com.vimal.grokking.algorithms.chapter.three.domain.Item;
import com.vimal.grokking.algorithms.chapter.three.domain.Key;
import org.jetbrains.annotations.NotNull;

public class SearchBoxRecursion {

    public static void lookForKey(@NotNull final Box mainBox) {
        for (Item itemInBox : mainBox.makePileToLookThrough()) {
            if (itemInBox instanceof Box) {
                lookForKey((Box) itemInBox);
            } else if (itemInBox instanceof Key) {
                System.out.println("found the key!");
                return;
            }
        }

    }
}
