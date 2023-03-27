package LoopHomeWork;

public class EvenlyBy1and3 {
	public static void main(String[] args) {
		int num = 20;
		for(int i=1;i<=num;i++) {
			if((i%1==0)&&(i%3==0)) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
