package com.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void updateGildedRoseProduct() {
        Item[] items = new Item[] { new Item("Normal", 10, 20),new Item("Aged Brie", 40, 20),new Item("Sulfuras", -1, 80),new Item("Backstage passes", 20, 10) };
        GildedRose gildedRose = new GildedRose(items);
        
        for(Item item : items){
        	gildedRose.updateQuality(item.name,item.sellIn,item.quality);
        }

        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(19, gildedRose.items[0].quality);
    }
}
