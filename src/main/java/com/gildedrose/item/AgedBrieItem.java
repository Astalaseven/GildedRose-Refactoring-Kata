package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.item.api.ItemToUpdate;

public class AgedBrieItem extends ItemWrapper implements ItemToUpdate {

    public AgedBrieItem(final Item item) {
        super(item);
    }

    public void update() {
        improveQuality();

        decreaseSellIn();

        if (sellInIsPassed()) {
            improveQuality();
        }
    }
}
