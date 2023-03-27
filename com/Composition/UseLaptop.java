package com.Composition;

public class UseLaptop {
	public static void main(String[] args) {
		Display d = new Display(14.4,"LED");
		Laptop lap = new Laptop("lenovo","thinkpad",15000,d);
		System.out.println(lap);
	}

}
