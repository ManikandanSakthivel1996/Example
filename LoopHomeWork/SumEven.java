package LoopHomeWork;

public class SumEven {
	public static void main(String[] args) {
		int num = 12;
		int sum = 0;
		for(int i=0;i<=num;i++) {
			if(i%2==1) {
				continue;
			}
			else if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
