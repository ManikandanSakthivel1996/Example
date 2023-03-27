package com.dayExceptionClass;

public class CheckName {
	public static void main(String[] args) {
		String a = "manikandan";
		try {
		if(!a.startsWith("a")) {
			throw new NameException("Not starts with a");
		}
		else {
			System.out.println("starts with m");
		}
		}
		catch(NameException n) {
			n.printStackTrace();
		}
			
		}
	}

