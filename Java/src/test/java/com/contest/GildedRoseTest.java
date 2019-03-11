package com.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void should_fix_me() {
        Item[] items = new Item[] { new Item("Normal", 10, 20),new Item("Aged Brie", 10, 20),new Item("Sulfuras", 10, 80),new Item("Backstage passes", 10, 20) };
        GildedRose gildedRose = new GildedRose(items);
        
        for(Item item : items){
        	gildedRose.updateQuality(item.name,item.sellIn,item.quality);
        }

        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(19, gildedRose.items[0].quality);
    }
}
