package com.dayFor2;

public class CheckFirstIndexHaveVowelLetter {
	public static void main(String[] args) {
		String [] names = {"gopi","n","gokul","alaji","MATHAN","rn","Ganesh","george"};
		int count = 0;
		for(int i=0;i<names.length;i++) {
			if(names[i].charAt(0)=='a'||names[i].charAt(0)=='e'||names[i].charAt(0)=='i'||names[i].charAt(0)=='n'){
				System.out.println(names[i]);
				count++;
			}
		}
			System.out.println(count);
	}

}
