package Collect3;

public class Student {
	private String name;
	private int rollno;
	private int age;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	public Student(String name, int rollno, int age, String gender) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.gender = gender;
	}
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
