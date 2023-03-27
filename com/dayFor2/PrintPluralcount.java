package com.dayFor2;

public class PrintPluralcount {
		public static void main(String[] args) {
			String [] names = {"gopi","mani","gokul","balaji","mathan","arun","Ganesh","george"};
			int count = 0;
			for(int i=0;i<names.length;i++) {
				if(names[i].contains("a")||names[i].contains("e")||names[i].contains("i")||names[i].contains("o")||names[i].contains("u")){
					System.out.println(names[i]);
					count++;
				}
			}
			System.out.println("count = "+count);
	}

}
