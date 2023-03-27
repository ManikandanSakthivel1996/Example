package com.dayFor2;

public class PrintPNNcount {
	public static void main(String[] args) {
		int[] ages = {26,-25,27,-28,0,-10,24,22};
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i=0;i<ages.length;i++) {
			if(ages[i]>0) {
				count++;
			}
			else if(ages[i]<0) {
				count1++;
			}
			else {
				count2++;
			}
		}
				System.out.println(count+" Even numbers");
				System.out.println(count1+" odd numbers");
				System.out.println(count2+" neutral numbers");
				
	}

}
