package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.item.api.ItemToUpdate;

public class BackstagePassItem extends ItemWrapper implements ItemToUpdate {

    public static final int FIRST_DEADLINE = 10;
    public static final int SECOND_DEADLINE = 5;

    public BackstagePassItem(final Item item) {
        super(item);
    }

    public void update() {
        updateQuality();

        decreaseSellIn();

        if (sellInIsPassed()) {
            resetQuality();
        }
    }

    private void updateQuality() {
        improveQuality();

        if (getSellIn() <= FIRST_DEADLINE) {
            improveQuality();
        }

        if (getSellIn() <= SECOND_DEADLINE) {
            improveQuality();
        }
    }
}
