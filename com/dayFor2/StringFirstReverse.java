package com.dayFor2;

public class StringFirstReverse {
	public static void main(String[] args) {
		String [] names = {"gopi","mani","gokul","balaji","mathan","arun","Ganesh","george"};
		for(int i=names.length/2-1;i>=0;i--) {
			System.out.println(names[i]);
		}
	}

}
