package com.dayFor2;

public class PrintConsonantCount {
	public static void main(String[] args) {
		String [] names = {"gopi","n","gokul","balaji","mathan","rn","Ganesh","george"};
		int count = 0;
		int count1 = 0;
		for(int i=0;i<names.length;i++) {
			if(names[i].contains("a")||names[i].contains("e")||names[i].contains("i")||names[i].contains("o")||names[i].contains("u")){
				count++;
			}
			else {
				count1++;
			}
		}
		System.out.println("vowels count = "+count);
		System.out.println("consonant count = "+count1);
	}

}
