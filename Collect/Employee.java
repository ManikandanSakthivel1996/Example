package Collect;

import java.util.List;

public class Employee {
private String name;
private int age;
private String gender;
private int salary;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String MaleName(String gender){
	if(gender.equals("Male")){
		return "Gender is: "+gender;
	}
	else {
		return "Gender is: "+gender;
	}
}
public Employee(String name, int age, String gender, int salary) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.salary = salary;
}
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary + "]";
} 

}
