package com.dayFunctions;

public class SubjectAverage {
	public void findaverage (String name, int tamil, int english, int social, int science, int maths) {
     System.out.println(name+ "="+(tamil+english+social+science+maths));
	}
	public static void main (String[] args) {
		SubjectAverage average = new SubjectAverage();
		average.findaverage("average", 20, 30, 40, 50, 60);
	}
}