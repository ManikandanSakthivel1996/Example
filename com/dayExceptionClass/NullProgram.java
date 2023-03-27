package com.dayExceptionClass;

public class NullProgram {
	public static void main(String[] args) {
		try {
			String a = null;
			System.out.println(a.length());
		}
		catch(NullPointerException ae) {
			System.out.println("Error occur");
			ae.printStackTrace();
			System.out.println(ae);
			
		}
		
	}

}
