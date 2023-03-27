package com.day3;

public class CheckequalsIgnoreCase {
	public static void main(String[]args) {
		String name = "manikandan";
		boolean result1 = name.equalsIgnoreCase("MANIKANDAN");
		boolean result2 = name.equalsIgnoreCase("manikandan");
		boolean result3 = name.equals("mathan");
		System.out.println(result1 +"\n"+ result2 +"\n"+ result3);		
	}

}
