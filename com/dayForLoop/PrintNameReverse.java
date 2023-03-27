package com.dayForLoop;

public class PrintNameReverse {
	public static void main (String[] args) {
		String word = "Dog";
		char[] value=word.toCharArray();
		String temp = "";
		for(int i=value.length-1; i>=0; i--) {
			temp = temp+word.charAt(i);
		}
		System.out.println(temp);
	}

}
