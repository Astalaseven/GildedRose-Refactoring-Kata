package com.gildedrose;

import com.gildedrose.item.AgedBrieItem;
import com.gildedrose.item.BackstagePassItem;
import com.gildedrose.item.CommonItem;
import com.gildedrose.item.NoOpItem;
import com.gildedrose.item.api.ItemToUpdate;

public class ItemToUpdateFactory {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public ItemToUpdate create(final Item item) {
        ItemToUpdate itemToUpdate;
        switch (item.name) {
            case AGED_BRIE:
                itemToUpdate = new AgedBrieItem(item);
                break;
            case BACKSTAGE_PASSES:
                itemToUpdate = new BackstagePassItem(item);
                break;
            case SULFURAS:
                itemToUpdate = new NoOpItem();
                break;
            default:
                itemToUpdate = new CommonItem(item);
                break;
        }
        return itemToUpdate;
    }
}
