package com.day4LMS;

public class Test8 {
	public static void main (String[] args) {
		String[] a = args[0].split(",");
		
		int [] array=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			array[i]=Integer.parseInt(a[i]);
		}
		
	     for(int i=0;i<array.length;i++) {
	    	 System.out.println(array[i]);
	     }
		
		/*
		int num1 = Integer.parseInt(a[0]);
		int num2 = Integer.parseInt(a[1]);
		int num3 = Integer.parseInt(a[2]);
		int result = num1 + num2 - num3;
		System.out.println(result);
		*/
	}

}
