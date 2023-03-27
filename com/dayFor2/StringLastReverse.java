package com.dayFor2;

public class StringLastReverse {
	public static void main(String[] args) {
		String [] names = {"gopi","mani","gokul","balaji","mathan","arun","Ganesh","george"};
		for(int i=names.length-1;i>=names.length/2;i--) {
			System.out.println(names[i]);
		}
	}

}
