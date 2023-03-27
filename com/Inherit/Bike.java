package com.Inherit;

public class Bike {
	String brand;
	int price;
	
	public String findNet(int price,int tax) {
		return"NetPrice="+(price+tax);
	}

}
