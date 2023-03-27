package com.dayExceptionClass;

public class ArrayIndexProgram {
	public static void main(String[] args) {
		try {
			int[] a = {1,2,3,4,5};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("error");
			ae.printStackTrace();
			System.out.println(ae);
			
		}
	}

}
