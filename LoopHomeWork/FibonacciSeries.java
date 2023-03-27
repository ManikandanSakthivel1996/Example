package LoopHomeWork;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 10;
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		int sum=0;
		for(int i=0;i<=n;i++) {
			num3 = num1+num2;
			sum=sum+num3;
			num1=num2;
			num2=num3;
			System.out.println(num1);
		}
		System.out.println(sum);
	}

}