package com.dayFor3;

public class UseWaterBottle {
	public static void main(String[] args) {
		WaterBottle wb1 = new WaterBottle();
		wb1.brand = "a";
		wb1.price = 30;
		wb1.isplastic = true;
		wb1.capacity = 10;
		
		WaterBottle wb2 = new WaterBottle();
		wb2.brand = "b";
		wb2.price = 10;
		wb2.isplastic = false;
		wb2.capacity = 20;
		
		WaterBottle wb3 = new WaterBottle();
		wb3.brand = "bisleri";
		wb3.price = 200;
		wb3.isplastic = true;
		wb3.capacity = 30;
		
		WaterBottle wb4 = new WaterBottle();
		wb4.brand = "AquaFina";
		wb4.price = 100;
		wb4.isplastic = false;
		wb4.capacity = 20;
		
		WaterBottle wb5 = new WaterBottle();
		wb5.brand = "e";
		wb5.price = 20;
		wb5.isplastic = true;
		wb5.capacity = 30;
		
		WaterBottle[] water = {wb1,wb2,wb3,wb4,wb5};
		for(WaterBottle X:water) {
			if(X.price>=100) {
				System.out.println(X.brand);
			}
		}
	}

}
