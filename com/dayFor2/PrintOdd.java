package com.dayFor2;

public class PrintOdd {
	public static void main(String[] args) {
		int[] ages = {26,25,27,28,5,10,24,22};
		for(int i=0;i<ages.length;i++) {
			if(ages[i]%2!=0) {
				System.out.println(ages[i]+ " is Odd number");
			}
		}
	}

}
