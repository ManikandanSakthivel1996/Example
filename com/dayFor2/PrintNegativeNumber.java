package com.dayFor2;

public class PrintNegativeNumber {
	public static void main(String[] args) {
		int[] ages = {26,25,-27,28,-5,10,-24,22};
		int count = 0;
		int count1 = 0;
		for(int i=0;i<ages.length;i++) {
			if(ages[i]<0) {
				System.out.println(ages[i]);
				count++;
			}
		}
				System.out.println(count);
	}

}
