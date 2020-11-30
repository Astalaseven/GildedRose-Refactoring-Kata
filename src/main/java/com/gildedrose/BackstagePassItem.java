package com.gildedrose;

public class BackstagePassItem implements ItemToUpdate {
    private final Item item;

    public BackstagePassItem(final Item item) {
        this.item = item;
    }

    public void update() {
        if (item.quality < 50) {
            updateQuality();
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    private void updateQuality() {
        upgradeQuality();

        if (item.sellIn < 11) {
            upgradeQuality();
        }

        if (item.sellIn < 6) {
            upgradeQuality();
        }
    }

    private void upgradeQuality() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
