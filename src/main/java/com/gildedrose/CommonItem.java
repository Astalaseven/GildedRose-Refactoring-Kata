package com.gildedrose;

public class CommonItem extends ItemWrapper implements ItemToUpdate {

    public CommonItem(final Item item) {
        super(item);
    }

    public void update() {
        decreaseQuality();

        decreaseSellIn();

        if (sellInIsPassed()) {
            decreaseQuality();
        }
    }
}
