package com.dayForLoop;

public class PrintDivisibleNumbers {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			 if((i%2==0)&&(i%4==0)) {
				 System.out.print(i*i*i);
			 }
			 else {
				 System.out.println();
			 }
		}
	}

}
