package com.dayHomeWork;

public class ACtemperature {
	public static void main (String[] args) {
		int ac = 31;
		if((ac >= 16) && (ac <= 20)) {
			System.out.println("cooling");
		}
		else if ((ac >= 20)&&(ac <= 23)) {
			System.out.println("normal");
		}
		else if ((ac >= 23) && ( ac <=30 )) {
			System.out.println("average");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
