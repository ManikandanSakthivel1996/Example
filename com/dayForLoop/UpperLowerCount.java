package com.dayForLoop;

public class UpperLowerCount {
	public static void main(String[] args) {
		String name = "maNIka";
		int uc = 0;
		int lc = 0;
		String a = name.toUpperCase();
		for(int i=0; i<name.length(); i++) {
			 if((name.charAt(i)==a.charAt(i))) {
				 uc++;
			 }
			 else {
				 lc++;
		 }
	}
		System.out.println("UpperCount= "+uc );
		System.out.println("Lowercount= "+lc);
	}

}
