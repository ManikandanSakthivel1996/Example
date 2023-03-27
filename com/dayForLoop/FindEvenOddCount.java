package com.dayForLoop;

public class FindEvenOddCount {
public static void main(String[] args) {
	int even = 0;
	int odd = 0;
	for(int i=0; i<=5; i++) {
		 if(i%2==0) {
			 System.out.print(even++);
		 }
		 else {
			 System.out.println(odd++);
		 }
	}
	System.out.println("even count = "+even);
	System.out.println("odd count = "+odd);
}

}
