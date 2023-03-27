package LoopHomeWork;

public class EvenlyDivisible {
	public static void main(String[] args) {
		int num = 25;
		for(int i=1;i<=num;i++) {
			if(i%3==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
