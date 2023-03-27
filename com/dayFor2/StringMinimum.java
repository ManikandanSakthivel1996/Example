package com.dayFor2;

public class StringMinimum {
	public static void main(String[] args) {
		String[]names = {"mani","mathan","gopi","sam"};
		int min = names[0].length();
		for(int i=0;i<names.length;i++) {
			if(names[i].length()<=min) {
				min=names[i].length();
			}
		}
		System.out.println(min);
	}

}
