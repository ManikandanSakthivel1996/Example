package LoopHomeWork;

public class PositiveNegative {
	public static void main(String[] args) {
		int num1= -8;
		int num2= 5;
		int count1 = 0;
		int count2 = 0;
		for(int i=num1;i<=num2;i++) {
			if(i<0) {
				count1++;
			}
			else if(i>0){
			    count2++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);

	}

}
