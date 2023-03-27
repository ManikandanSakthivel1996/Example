package com.dayExceptionClass;

public class ArithmeticProgram {
	public static void main(String[] args) {
		System.out.println("start");
		try {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
		}
		catch(Exception ae) {
		
		System.err.println("Invalid data");
	    //ae.printStackTrace();
	    //System.out.println(ae);
		}
	   
		System.out.println("stop");
	}

}
