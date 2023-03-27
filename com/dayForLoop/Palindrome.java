package com.dayForLoop;

public class Palindrome {
	public static void main(String[] args) {
		String word = "mom";
		String temp = "";
		for(int i=word.length()-1; i>=0; i--) {
			temp = temp+word.charAt(i);
		}
			//System.out.println(word.charAt(i));
			if (word.equalsIgnoreCase(temp)) {
				System.out.println("palindrome");
		}
			else {
				System.out.println("not a palindrome");
			}
	
}
}
