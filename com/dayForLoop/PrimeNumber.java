package com.dayForLoop;

public class PrimeNumber {
	public static void main(String[] args) {
		int num =4;
		boolean a = true;
		for(int i=2; i<num; i++) {
			 if(num%i==0) 
			 a= false;
		}
			 if(a==true) {
		     System.out.println("prime");
			 }
			 else {
		     System.out.println("not prime");
			 }
		}
	
		
}