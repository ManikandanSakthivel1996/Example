package com.day2;

public class Bikes {
	public static void main (String[]args) {
		UseCar vehicle1 = new UseCar();
		vehicle1.price = (20000);
		vehicle1.colour = "blue";
		vehicle1.brand = "apache";
		vehicle1.size = (309485);
		System.out.println("bike Price is = "+vehicle1.price);
		System.out.println("bike Colour is = "+vehicle1.colour);
		System.out.println("bike Brand name is = "+vehicle1.brand);
		System.out.println("bike Engine Number is = "+vehicle1.size);
	}

}
