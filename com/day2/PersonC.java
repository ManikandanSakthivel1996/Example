package com.day2;

public class PersonC {
	public static void main(String []args) {
		Employee person3 = new Employee();
		person3.age = 27;
		person3.gender = "male";
		person3.id = 2873;
		person3.name = "ragu";
		person3.taxamount =20000*5/100;
		person3.netsalary = person3.salary-person3.taxamount;
		person3.salary = 20000;
		System.out.println(person3.age);
		System.out.println(person3.gender);
		System.out.println(person3.id);
		System.out.println(person3.name);
		System.out.println(person3.salary);
		System.out.println(person3.taxamount);
		System.out.println(person3.netsalary);
		}

}
