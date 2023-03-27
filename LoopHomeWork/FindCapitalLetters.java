package LoopHomeWork;

public class FindCapitalLetters {
	public static void main(String[] args) {
		String word = "maNiKanDan";
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)>='A'&&word.charAt(i)<='Z'){
				count++;
			}
		}
		System.out.println(count);
	}

}