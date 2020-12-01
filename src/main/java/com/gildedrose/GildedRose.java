package com.gildedrose;

import com.gildedrose.item.api.ItemToUpdate;

class GildedRose {

    private final Item[] items;

    private final ItemToUpdateFactory itemToUpdateFactory;

    public GildedRose(final Item[] items) {
        this.items = items;
        this.itemToUpdateFactory = new ItemToUpdateFactory();
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
        final ItemToUpdate itemToUpdate = itemToUpdateFactory.create(item);
        itemToUpdate.update();
    }
}