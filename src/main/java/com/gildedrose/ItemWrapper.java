package com.gildedrose;

import static com.gildedrose.ItemConstant.MAX_QUALITY;
import static com.gildedrose.ItemConstant.MIN_QUALITY;

public class ItemWrapper {

    private final Item item;

    public ItemWrapper(final Item item) {
        this.item = item;
    }

    public int getSellIn() {
        return item.sellIn;
    }

    public int getQuality() {
        return item.quality;
    }

    public void improveQuality() {
        if (getQuality() < MAX_QUALITY) {
            this.item.quality += 1;
        }
    }

    public void decreaseQuality() {
        if (getQuality() > MIN_QUALITY) {
            this.item.quality -= 1;
        }
    }

    public void resetQuality() {
        this.item.quality = 0;
    }

    public void decreaseSellIn() {
        this.item.sellIn -= 1;
    }

    public boolean sellInIsPassed() {
        return this.item.sellIn < 0;
    }
}
