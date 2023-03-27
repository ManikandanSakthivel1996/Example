package com.dayFunctions;

public class Ageswith {
	public void findage(String name, int age) {
		System.out.println(name+" "+age);
	}
	public static void main (String[] args) {
		Ageswith a = new Ageswith();
		a.findage("mani", 12);
		a.findage("mathan", 24);
	}

}
