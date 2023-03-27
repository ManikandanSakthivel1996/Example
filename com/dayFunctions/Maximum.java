package com.dayFunctions;

public class Maximum {

	public int max(int[] a) {
		int[] a1 = { 6, 8, 9, 3, 5, 7 };
		int max = a1[0];
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] >= max) {
				max = a1[i];
			}
		}
				return max;

	}

	public static void main(String[] args) {
		Maximum b = new Maximum();
		int[] a1 = { 6, 8, 9, 3, 5, 7 };
		System.out.println(b.max(a1));
	}
}
