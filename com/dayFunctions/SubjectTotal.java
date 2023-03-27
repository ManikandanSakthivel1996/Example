package com.dayFunctions;

public class SubjectTotal {
	public int findtotal(int tamil,int english,int social,int maths,int science ) {
		int total = tamil+english+social+maths+science;
		return total;
		
	}
	public static void main (String[] args) {
		SubjectTotal totals = new SubjectTotal();
		System.out.println(totals.findtotal(50, 60, 70, 80, 90));
	}

}
