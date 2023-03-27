package com.Inherit;

public class Usepen {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.brand = "hero";
		p1.price = 30;
		p1.isInk = true;
		
		if(p1.isInk==true) {
			System.out.println("refillable");
		}
		else {
			System.out.println("not refillable");
		}
	}

}
