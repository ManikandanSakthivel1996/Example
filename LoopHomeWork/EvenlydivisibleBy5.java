package LoopHomeWork;

public class EvenlydivisibleBy5 {
	public static void main(String[] args) {
		int num =40;
		int count = 0;
		for(int i=1;i<=num;i++) {
		if (i%5==0) {
		count++;
		}
		}
		System.out.println(count);
	}

}
