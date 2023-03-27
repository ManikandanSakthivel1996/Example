package LoopHomeWork;

public class EvenCharacters {
	public static void main(String[] args) {
		String word = "AMAZING";
		for(int i=0;i<word.length();i++) {
			if(i%2==0) {
				System.out.print(word.charAt(i));
			}
		}
	}

}
