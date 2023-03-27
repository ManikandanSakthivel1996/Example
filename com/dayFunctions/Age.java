package com.dayFunctions;

public class Age {
	public String findage(int age) {
		if(age>=18) {
			return "u are eligible to vote";
			
		}
		else {
			return "u are not eligible to vote";
		}
	}
	
	public static void main (String[] args) {
		Age ages = new Age();
		System.out.println(ages.findage(18));
	}

}
