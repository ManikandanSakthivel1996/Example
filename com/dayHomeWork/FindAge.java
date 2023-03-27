package com.dayHomeWork;

public class FindAge {
	public static void main(String[] args) {
		int age = 6;
		if((age>=0)&&(age<=10)) {
			System.out.println("you are kid");
		}
		else if((age>=10)&&(age<=18)) {
			System.out.println("you are teenage");
		}
		else if((age>=18)&&(age<=23)) {
			System.out.println("you are adult");
		}
		else {
			System.out.println("invalid");
		}
		
	}

}
