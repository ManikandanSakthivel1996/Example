package com.dayFor2;

public class PrintLowerCase {
	public static void main(String[] args) {
		String [] names = {"gopi","n","gokul","balaji","MATHAN","rn","Ganesh","george"};
		int count = 0;
		int count1 = 0;
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(names[i].toLowerCase())){
					System.out.println(names[i]);
				count++;
			}
		}
		System.out.println("Lower count "+count);
	}

}
