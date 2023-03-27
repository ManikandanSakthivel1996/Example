package com.day2;

public class Tabs {
	public static void main(String[]args) {
		Tab tab = new Tab();
		tab.price = 50000;
		tab.brand = "lenovo";
		tab.colour = "yellow";
		tab.size = 3;
		tab.netprice = tab.taxamount;
		tab.taxamount = tab.price+5;
		System.out.println(tab.price);
		System.out.println(tab.brand);
		System.out.println(tab.colour);
		System.out.println(tab.size);
		System.out.println(tab.taxamount);
		System.out.println(tab.netprice);
		
	}

}
