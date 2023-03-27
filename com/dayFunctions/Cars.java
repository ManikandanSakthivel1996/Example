package com.dayFunctions;

public class Cars {
	String brand;
	int price;
	String color;

	public String findmaxprice(Cars car1, Cars car2, Cars car3) {
		if (car1.price > car2.price && car1.price > car3.price && car1.price > car4.price) {
			return car1.brand;
		} 
		else if (car2.price > car3.price && car2.price > car1.price) {
			return car2.brand;
		}
		else if(car3.price > car1.price && car2.price > car1.price) {
			return car3.brand;
		}
	}

}
