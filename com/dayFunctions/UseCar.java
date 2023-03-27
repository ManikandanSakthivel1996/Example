package com.dayFunctions;

public class UseCar {
	public static void main (String[] args) {
		
		Car car1 = new Car();
		car1.brand = "suzuki";
		car1.price =250000;
		car1.color = "red";
		
		Car car2 = new Car();
		car2.brand = "bmw";
		car2.price = 350000;
		car2.color = "blue";
		
		//System.out.println(car2.findMaximumPrice(car1, car2));//
		System.out.println(car1.findMaximumPrice(car1, car2));
	}

}
