package com.day3;

public class ToSplitCharacter {
	public static void main (String[]args) {
		String word = "hello-world";
		String[]a = word.split("-");
		int arraylength = a.length;
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println(a[0].length());
		System.out.println(a[1].length());
		System.out.println(arraylength);
		
	}

}
