package Collect2;
import java.util.*;

public class UseStudents {
	public static void main(String[] args) {
		Student s1 = new Student("mani",15,"male",2500,101);
		Student s2 = new Student("ravi",20,"male",4500,102);
		Student s3 = new Student("mathi",12,"female",1500,103);
		Student s4 = new Student("ranjith",14,"male",2200,104);
		Student s5 = new Student("babu",20,"male",2500,105);
		Student s6 = new Student("meena",12,"female",2400,106);
		Student s7 = new Student("mathan",20,"male",1500,107);
		Student s8 = new Student("sivaranjini",10,"female",3500,108);
		
		HashMap<Integer,Student> students = new HashMap<>();
		
		students.put(s1.getId(),s1);
		students.put(s2.getId(),s2);
		students.put(s3.getId(),s3);
		students.put(s4.getId(),s4);
		students.put(s5.getId(),s5);
		students.put(s6.getId(),s6);
		students.put(s7.getId(),s7);
		students.put(s8.getId(),s8);
		
		ArrayList <Student> age= new ArrayList<>();
		for(Student x : students.values()) {
				if(x.getAge()>=20) {
					age.add(x);
					System.out.println(x);
			}
		}
		
	}

}
