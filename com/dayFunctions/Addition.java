package com.dayFunctions;

public class Addition {
	public int findadd() {
		int a= 5;
		int b= 10;
		return a+b;
	}
	
	public static void main (String[] args) {
		Addition add = new Addition();
		System.out.println(add.findadd());
	}

}
