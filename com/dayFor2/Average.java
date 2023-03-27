package com.dayFor2;

public class Average {
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
		int temp  =0;
		int count = 0;
		for(int i=0;i<ages.length;i++) {
			temp = temp+ages[i];
			count++;
		}
		System.out.println(temp/count);
	}

}
