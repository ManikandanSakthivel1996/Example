package com.day2;

public class PersonB {
	public static void main(String []args) {
	Employee person2 = new Employee();
	person2.age = 25;
	person2.gender = "male";
	person2.id = 1203;
	person2.name = "bala";
	person2.salary = 30000;
	person2.taxamount =25000*5/100;
	person2.netsalary = 25000-person2.taxamount;
	System.out.println(person2.age);
	System.out.println(person2.gender);
	System.out.println(person2.id);
	System.out.println(person2.name);
	System.out.println(person2.salary);
	System.out.println(person2.taxamount);
	System.out.println(person2.netsalary);
	}
}
