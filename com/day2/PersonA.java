package com.day2;

public class PersonA {
	public static void main(String[]args) {
		Employee person1 = new Employee();
		person1.age = 26;
		person1.gender = "male";
		person1.id = 9021;
		person1.name = "guna";
		person1.salary = 25000;
		person1.taxamount =25000*5/100;
		person1.netsalary = 25000-person1.taxamount;
		System.out.println(person1.age);
		System.out.println(person1.gender);
		System.out.println(person1.id);
		System.out.println(person1.name);
		System.out.println(person1.salary);
		System.out.println(person1.taxamount);
		System.out.println(person1.netsalary);
	}

}
