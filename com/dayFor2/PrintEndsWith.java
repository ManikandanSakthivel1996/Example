package com.dayFor2;

public class PrintEndsWith {
	public static void main(String[] args) {
		String [] names = {"gopi","n","gokul","balaji","mathan","rn","Ganesh","george"};
		int count = 0;
		int count1 = 0;
		for(int i=0;i<names.length;i++) {
			if(names[i].endsWith("a")||names[i].endsWith("e")||names[i].endsWith("i")||names[i].endsWith("o")||names[i].endsWith("u")){
				System.out.println(names[i]);
				count++;
			}
			else {
				count1++;
			}
		}
		System.out.println("names = "+count);
	}

}
