package com.gildedrose;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextTestFixture {
    public static void main(String[] args) throws IOException {
        Item[] items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6)
        };

        GildedRose app = new GildedRose(items);

        int days = 30;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        StringBuilder goldenMaster = new StringBuilder();

        for (int i = 0; i < days; i++) {
            goldenMaster.append("-------- day " + i + " --------");
            goldenMaster.append(System.lineSeparator());
            goldenMaster.append("name, sellIn, quality");
            goldenMaster.append(System.lineSeparator());
            for (Item item : items) {
                goldenMaster.append(item);
                goldenMaster.append(System.lineSeparator());
            }
            goldenMaster.append(System.lineSeparator());
            app.update();
        }

        Files.write(Paths.get("GoldenMaster.txt"), goldenMaster.toString().getBytes());
    }

}
