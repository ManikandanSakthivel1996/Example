package com.dayExceptionClass;

public class NumberFormatExceptionProgram {
	public static void main(String[] args) {
		try {
			String a = "mani";
			int b = Integer.parseInt(a);
			System.out.println(b);
		}
		catch(Exception ae) {
			System.out.println("error occurs");
			ae.printStackTrace();
			System.out.println(ae);
		}
		finally {
			System.out.println("Stop");
		}
	}

}
