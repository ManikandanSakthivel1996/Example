package LoopHomeWork;

public class Palindrome {
	public static void main(String[] args) {
		String word = "melan";
		String name = "";
		
		for(int i=word.length()-1;i>=0;i--) {
			name=name+word.charAt(i);
		}
		if(word.equalsIgnoreCase(name)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("no palindrome");
		}
		
	}

}
