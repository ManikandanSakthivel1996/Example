package com.dayExceptionClass;

public class CheckAge {
	public static void main(String[] args)throws Exception {
		int age=17;
		try {
		if(age<18) {
			throw new AgeException("Not Eligible");
		}
		else {
			System.out.println("Eligible");
		}
		}
		catch(AgeException s) {
			s.printStackTrace();
			System.out.println(s);
		}
	}

}
