package com.dayFor2;

public class MinimumString {
	public static void main(String[] args) {
		String[]names = {"mani","mathan","gopinathan","sam"};
		String temp = "";
		int min = names[0].length();
		for(int i=0;i<names.length;i++) {
			if(names[i].length()<=min) {
				min=names[i].length();
				temp = names[i];
			}
		}
		System.out.println(min+" "+temp);
	}

}
