package com.day4LMS;

public class FirstAndLastCharacter {
	public static void main(String[] args) {
		String[]a = args[0].split(",");
		String name1 = a[0];
		String name2 = a[1];
		System.out.println(name2.charAt(0));
		System.out.println(name1.charAt(name1.length()-1));
	}

}
