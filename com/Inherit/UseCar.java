package com.Inherit;

public class UseCar {
	public static void main(String[] args) {
		//(boolean isAutomatic,String brand,int price,String color
		
		Car c1 = new Car(true,"suzuki",360000,"red");
		Car c2 = new Car(false,"honda",450000,"blue");
		Car c3 = new Car(true,"tata",550000,"red");
		Car[] cars = {c1,c2,c3};
		int max = cars[0].price;
		Car d = null;
		for(int i=0;i<cars.length;i++) {
			if(cars[i].price>max) {
				max=cars[i].price;
				d=cars[i];
			}
		}
		System.out.println(d);
	}

}
