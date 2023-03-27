package com.dayFor2;

public class PrintOddandEvenCount {
	public static void main(String[] args) {
		int[] ages = {26,25,27,28,5,10,24,22};
		int count = 0;
		int count1 = 0;
		for(int i=0;i<ages.length;i++) {
			if(ages[i]%2!=0) {
				count++;
			}
			else if(ages[i]%2==0) {
				count1++;
			}
		}
			System.out.println(count +" Odd");
			System.out.println(count1+" Even");
	}

}
