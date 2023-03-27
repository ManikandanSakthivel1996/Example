package com.day3;

public class Test4 {
	public static void main(String[] args) {
		String name = "manikandan";
		String name1 = "mani-kandan";
		String result1 = name.toUpperCase();
		System.out.println(result1);
		String result2 = name.toLowerCase();
		System.out.println(result2);
		int    result3 = name.length();
		System.out.println(result3);
		String result4 = name.concat(" sakthivel");
		System.out.println(result4+ "\n");
		
		boolean result5 = name.contains("ni");
		System.out.println(result5);
		boolean result6 = name.startsWith("ma");
		System.out.println(result6);
		boolean result7 = name.endsWith("an");
		System.out.println(result7);
		boolean result8 = name.equals("manikandan");
		System.out.println(result8);
		boolean result9 = name.equalsIgnoreCase("manikandan");
		System.out.println(result9+"\n");
		
		char   result10 = name.charAt(4);
		System.out.println(result10);
		int    result11 = name.indexOf('k');
		System.out.println(result11);
		String result12 = name.substring(0,5);
		System.out.println(result12 +"\n");
		String[] result13 = name1.split("-");
		System.out.println(result13 [0]);
		System.out.println(result13 [1]);
		char[] result14 = name.toCharArray();
		System.out.println(result14 [0]);
		System.out.println(result14 [1]);
		System.out.println(result14 [2]);
		System.out.println(result14 [3]);
	}
	
}
