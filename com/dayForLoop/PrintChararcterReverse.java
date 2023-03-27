package com.dayForLoop;

public class PrintChararcterReverse {
	public static void main(String[] args) {
		String word = "manikandan";
		for(int i=word.length()-1; i>=0; i--) {
			System.out.println(word.charAt(i));
		}
	}

}
