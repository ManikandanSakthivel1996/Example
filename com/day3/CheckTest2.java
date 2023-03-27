package com.day3;

public class CheckTest2 {
	public static void main (String[]args) {
		String name = "manikandan";
		boolean result1 = name.contains("am");
		boolean result2 = name.startsWith("ma");
		boolean result3 = name.endsWith("na");
		boolean result4 = name.equals("manikandan");
		boolean result5 = name.equalsIgnoreCase("kandanmani");
		System.out.println(result1 +"\n"+ result2 +"\n"+ result3 +"\n"+ result4 +"\n"+ result5);
	}

}
