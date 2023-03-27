package com.dayFor2;

public class AddInt {
	public static void main(String[] args) {
		int[] ages = new int[8];
		ages[0] = 28;
		ages[1] = 27;
		ages[2] = 26;
		ages[3] = 27;
		ages[4] = 26;
		ages[5] = 25;
		ages[6] = 22;
		ages[7] = 26;
		int sum = 0;
		for(int i=0;i<=ages.length-1;i++) {
			sum=sum+ages[i];
			//System.out.println(sum);
		}
		System.out.println(sum);
	}

}
