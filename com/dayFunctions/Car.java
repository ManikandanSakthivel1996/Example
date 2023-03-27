package com.dayFunctions;

public class Car {
	String brand;
	int price;
	String color;

	public String findMaximumPrice(Car a,Car b) {
		if(a.price>b.price) {
			return a.brand;
		}
		else {
			return b.brand;
		}
		}
	}

