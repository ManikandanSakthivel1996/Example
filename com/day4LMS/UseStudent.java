package com.day4LMS;

public class UseStudent {
	public static void main (String[] args) {
		Student student = new Student();
		student.name = args[0];
		student.age = Integer.parseInt(args[1]);
		student.weight = Float.parseFloat(args[2]);
		student.phoneNO = Long.parseLong(args[3]);
		student.isMale = Boolean.parseBoolean(args[4]);
		System.out.println(student.name+","+student.age+","+student.weight+","+student.phoneNO+","+student.isMale);
	    
		Student student2 = new Student();
		student2.name = args[5];
		student2.age =Integer.parseInt(args[6]);
		student2.weight = Float.parseFloat(args[7]);
		student2.phoneNO = Long.parseLong(args[8]);
		student2.isMale = Boolean.parseBoolean(args[9]);
		System.out.println(student2.name+","+student2.age+","+student2.weight+","+student2.phoneNO+","+student2.isMale);
	}

}

class Student {
	String name;
	int age;
	float weight;
	long phoneNO;
	boolean isMale;
}
