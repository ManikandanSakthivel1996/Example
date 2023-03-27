package com.day2;

public class Mobile {
	public static void main (String[]args) {
		Mobiles mobile = new Mobiles();
		mobile.price = 30000;
		mobile.brand = "redmi";
		mobile.colour = "grey";
		mobile.size = 5;
		mobile.taxamount = 5;
		mobile.netprice = (mobile.price-mobile.taxamount);
		System.out.println(mobile.price);
		System.out.println(mobile.brand);
		System.out.println(mobile.colour);
		System.out.println(mobile.size);
		System.out.println(mobile.netprice);
		System.out.println(mobile.taxamount);
	}

}
