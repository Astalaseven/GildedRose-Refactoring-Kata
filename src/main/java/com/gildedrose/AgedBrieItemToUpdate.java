package com.gildedrose;

public class AgedBrieItemToUpdate implements ItemToUpdate {
    private final Item item;

    public AgedBrieItemToUpdate(final Item item) {
        this.item = item;
    }

    public void update() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }
}
