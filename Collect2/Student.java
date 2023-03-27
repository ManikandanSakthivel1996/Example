package Collect2;

public class Student {
	private String name;
	private int age;
	private String gender;
	private int fees;
	private int id;
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
	public String isGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(String name, int age, String gender, int fees, int id) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.fees = fees;
		this.id = id;
	}
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", fees=" + fees + ", id=" + id + "]";
	}

}
