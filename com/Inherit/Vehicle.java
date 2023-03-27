package com.Inherit;

public class Vehicle {
    String brand;
    int price;
    String color;
	
	public Vehicle(String brand, int price,String color) {
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	public String toString() {
		return ("brand "+brand+" price "+price+" color "+color);
	}

}
