package com.dayFunctions;

public class UseCars {
	public static void main (String[] args) {
	Cars car1 = new Cars();
	car1.brand = "suzuki";
	car1.price =250000;
	car1.color = "red";
	
	Cars car2 = new Cars();
	car2.brand = "dakd";
	car2.price = 450000;
	car2.color = "blue";
	
	Cars car3 = new Cars();
	car3.brand = "bmw";
	car3.price = 350000;
	car3.color = "blue";
	
	Cars car4 = new Cars();
	car4.brand = "bmw";
	car4.price = 350000;
	car4.color = "blue";
	System.out.println(car1.findmaxprice(car1, car2, car3,car4));
	
	
	}
}
