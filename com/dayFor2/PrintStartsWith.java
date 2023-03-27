package com.dayFor2;

public class PrintStartsWith {
	public static void main(String[] args) {
		String [] names = {"gopi","n","gokul","balaji","mathan","rn","Ganesh","george"};
		int count = 0;
		int count1 = 0;
		for(int i=0;i<names.length;i++) {
			if(names[i].startsWith("g")||names[i].startsWith("m")||names[i].startsWith("i")||names[i].startsWith("o")||names[i].startsWith("u")){
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

