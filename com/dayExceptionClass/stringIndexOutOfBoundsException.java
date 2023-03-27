package com.dayExceptionClass;

public class stringIndexOutOfBoundsException {
	public static void main(String[] args) {
		try {
			String a = "mani2014";
			System.out.println(a.charAt(8));
		}
		catch(StringIndexOutOfBoundsException ae){
			System.out.println("error");
			ae.printStackTrace();
			System.out.println(ae);
			
		}
	}

}
