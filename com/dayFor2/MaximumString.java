package com.dayFor2;

public class MaximumString {
	public static void main(String[] args) {
		String[]names = {"mani","mathan","gopi","sam"};
		String temp= "";
		int max = names[0].length();
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>=max) {
				max=names[i].length();
				temp = names[i];
			}
		}
		System.out.println(max+ " " +temp);
	}
}
