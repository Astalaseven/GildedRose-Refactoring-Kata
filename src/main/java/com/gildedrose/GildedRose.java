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
        ItemToUpdate itemToUpdate;
        switch (item.name) {
            case "Aged Brie":
                itemToUpdate = new AgedBrieItem(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                itemToUpdate = new BackstagePassItem(item);
                break;
            case "Sulfuras, Hand of Ragnaros":
                itemToUpdate = new NoOpItemToUpdate();
                break;
            default:
                itemToUpdate = new CommonItem(item);
                break;
        }
        itemToUpdate.update();
    }
}