package com.day4LMS;

public class UsePen {
	public static void main (String[] args) {
		Pen pen = new Pen();
		String[] a = args[0].split(":");
		pen.brand = a[0];
		pen.price = Integer.parseInt(a[1]);
		pen.colour = a[2];
		System.out.println("Brand = " +pen.brand+",price = "+pen.price+",colour = "+pen.colour);
		
		Pen pen1 = new Pen();
		String[]b = args[1].split(":");
		pen1.brand = b[0];
		pen1.price = Integer.parseInt(b[1]);
		pen.colour = b[2];
		System.out.println("Brand = "+pen1.brand+",price = "+pen1.price+",colour = "+pen.colour);
		
	}

}

class Pen {
	String brand;
	int price;
	String colour;
}

