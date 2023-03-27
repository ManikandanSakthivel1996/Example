package com.Inherit;

public class UseSportBike {
	public static void main(String[] args) {
		SportsBike b1 = new SportsBike();
		b1.brand="yamaha";
		b1.price=250000;
		b1.EngineCc=180;
		b1.weight=200;
		
		SportsBike b2 = new SportsBike();
		b2.brand="tvs";
		b2.price=200000;
		b2.EngineCc=150;
		b2.weight=180;
		
		System.out.println(b1.findNet(b1.price, 35000));
		System.out.println(b1.findNet(b2.price, 50000));
	}

}
