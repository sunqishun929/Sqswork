package com.contest;
 
class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    /**
     * 商品销售期和品质计算方法
     * @param name
     * @param sellIn
     * @param quality
     */
    public void updateQuality(String name,int sellIn,int quality) {
    	if("Normal".equals(name)){//普通商品
    		items[0].sellIn = sellIn-1;
            items[0].quality = quality-1;
            if(sellIn < 0){//商品过了销售期后，品质每天减2
            	items[0].quality = quality-2;
            }
            if(quality < 0){//品质为负数时，设为0
            	items[0].quality = 0;
            }
    	}else if("Aged Brie".equals(name)){//法国干酪
    		items[1].sellIn = sellIn-1;
            items[1].quality = quality+1;
            if(quality > 50){//品质不会大于50
            	items[0].quality = 50;
            }
    	}else if("Sulfuras".equals(name)){//传奇商品
    		items[2].sellIn = sellIn;
            items[2].quality = 80;
    	}else if("Backstage passes".equals(name)){//剧场后台通行证
    		if(sellIn>10){//距离开场时间大于10天
    			items[3].sellIn = sellIn-1;
                items[3].quality = quality+1;
    		}
    		if(sellIn>5 && sellIn<10){//距离开场时间大于5天,小于10
    			items[3].sellIn = sellIn-1;
                items[3].quality = quality+2;
    		}
    		if(sellIn>0 && sellIn<5){//距离开场时间大于0天,小于5
    			items[3].sellIn = sellIn-1;
                items[3].quality = quality+3;
    		}
    		if(sellIn<0){//演出结束后
    			items[3].sellIn = sellIn;
                items[3].quality = 0;
    		}
    	}
    }
}