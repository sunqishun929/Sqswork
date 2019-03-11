package com.contest;
 
class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    /**
     * ��Ʒ�����ں�Ʒ�ʼ��㷽��
     * @param name
     * @param sellIn
     * @param quality
     */
    public void updateQuality(String name,int sellIn,int quality) {
    	if("Normal".equals(name)){//��ͨ��Ʒ
    		items[0].sellIn = sellIn-1;
            items[0].quality = quality-1;
            if(sellIn < 0){//��Ʒ���������ں�Ʒ��ÿ���2
            	items[0].quality = quality-2;
            }
            if(quality < 0){//Ʒ��Ϊ����ʱ����Ϊ0
            	items[0].quality = 0;
            }
    	}else if("Aged Brie".equals(name)){//��������
    		items[1].sellIn = sellIn-1;
            items[1].quality = quality+1;
            if(quality > 50){//Ʒ�ʲ������50
            	items[0].quality = 50;
            }
    	}else if("Sulfuras".equals(name)){//������Ʒ
    		items[2].sellIn = sellIn;
            items[2].quality = 80;
    	}else if("Backstage passes".equals(name)){//�糡��̨ͨ��֤
    		if(sellIn>10){//���뿪��ʱ�����10��
    			items[3].sellIn = sellIn-1;
                items[3].quality = quality+1;
    		}
    		if(sellIn>5 && sellIn<10){//���뿪��ʱ�����5��,С��10
    			items[3].sellIn = sellIn-1;
                items[3].quality = quality+2;
    		}
    		if(sellIn>0 && sellIn<5){//���뿪��ʱ�����0��,С��5
    			items[3].sellIn = sellIn-1;
                items[3].quality = quality+3;
    		}
    		if(sellIn<0){//�ݳ�������
    			items[3].sellIn = sellIn;
                items[3].quality = 0;
    		}
    	}
    }
}