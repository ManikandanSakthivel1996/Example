package com.dayForLoop;

public class BreakSkip {
	public static void main(String[] args) {
		
		     for(int i=1; i<=10; i++) {
			 if(i%2==0) {
			 break;
			 }
			 else {
			 System.out.println(i);
			 }
		}
		     for(int i=1; i<=10; i++) {
				 if(i%3==0) {
				continue;
			     }
	             else {
					 System.out.print(i+"\n");
				 }
	}
	
}
}

