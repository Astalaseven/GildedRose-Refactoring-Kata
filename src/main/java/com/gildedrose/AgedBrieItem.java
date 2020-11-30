package com.gildedrose;

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
