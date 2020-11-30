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

        switch (item.name) {
            case "Aged Brie":
                new AgedBrieItem(item).update();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                new BackstagePassItem(item).update();
                break;
            case "Sulfuras, Hand of Ragnaros":
                break;
            default:
                new CommonItem(item).update();
                break;
        }
    }
}