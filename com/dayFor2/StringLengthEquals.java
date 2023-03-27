package com.dayFor2;

public class StringLengthEquals {
	public static void main(String[] args) {
		String [] names = {"gopi","n","gokul","balaji","MATHAN","rn","Ganesh","george"};
		int count = 0;
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>=5){
				System.out.println(names[i]);
				count++;
			}
		}
			System.out.println(count);
	}

}
