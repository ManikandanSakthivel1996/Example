package com.dayFunctions;

public class TrueorFalse {
	public boolean Findage(int a, int b) {
		boolean c= a==b;
		return c;
	}
	public static void main (String[] args) {
		TrueorFalse d = new TrueorFalse();
		System.out.println(d.Findage(26, 25));
	}

}
