package com.day2;

public class Laptop {
	public static void main(String[]args) {
		Laptops laptop = new Laptops();
		laptop.brand = "asus";
		laptop.colour ="silver";
		laptop.price = 90000;
		laptop.size = 9;
		laptop.netprice = laptop.price + 5;
		laptop.taxamount = 5;
		System.out.println(laptop.brand+","+laptop.colour+","+laptop.price+","+laptop.size);
		System.out.println(laptop.netprice);
		System.out.println(laptop.taxamount);
		System.out.println(laptop.netprice);
		System.out.println(laptop.taxamount);
	}

}
