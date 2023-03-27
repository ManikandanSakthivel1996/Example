package LoopHomeWork;

public class OddAndEven {
	public static void main(String[] args) {
		int num = 10;
		for(int i=0;i<=num;i++) {
			if(i%2==1) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
