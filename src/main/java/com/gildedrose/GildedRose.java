package com.gildedrose;

class GildedRose {

    private final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void update() {
        for (final Item item : items) {
            update(item);
        }
    }

    private void update(final Item item) {

        if (item.name.equals("Aged Brie")) {
            new AgedBrieService().update(item);
            return;
        }

        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            new BackstagePassService().update(item);
            return;
        }

        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }

        updateCommonItem(item);
    }

    private void updateCommonItem(final Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }
}