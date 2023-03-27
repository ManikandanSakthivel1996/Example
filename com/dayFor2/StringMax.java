package com.dayFor2;

public class StringMax {
	public static void main(String[] args) {
		String[]names = {"mani","mathan","gopi","sam"};
		int max = names[0].length();
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>=max) {
				max=names[i].length();
			}
		}
		System.out.println(max);
	}

}
