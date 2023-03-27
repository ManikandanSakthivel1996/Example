package com.dayForLoop;

public class FindAverage {
	public static void main(String[] args) {
		int temp1 = 0;
		int count = 0;
		for(int i=0; i<=1000; i++) {
			temp1 = temp1+i;
			count = count+1;
		}
		System.out.println(temp1/count);
	}

}
