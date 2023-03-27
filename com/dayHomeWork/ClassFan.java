package com.dayHomeWork;

public class ClassFan {
	public static void main(String[] args) {
	Fan f1 = new Fan();	
	Fan f2 = new Fan();
	
	f1.price = 20;
	f1.colour = "BLACK";
	f1.brand = "Usha";
	
	f2.price = 30;
	f2.colour = "red";
	f2.brand = "onida";
	
	if(f1.colour.equals(f1.colour.toUpperCase())) {
		System.out.println(f1.colour.charAt(f1.colour.length()/2));
	}
	else {
		System.out.println("invalid");
	}
	
	}

}
class Fan {
	int price;
	String colour;
	String brand;
}
