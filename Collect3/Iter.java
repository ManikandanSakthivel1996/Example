package Collect3;

import java.util.*;

public class Iter {
	public static void main(String[] args) {
		Student s1 = new Student("mani",1072,17,"male");		
		Student s2 = new Student("mathan",1073,15,"male");		
		Student s3 = new Student("raju",1074,15,"male");		
		Student s4 = new Student("ram",1075,17,"male");
		
		HashMap<Integer,Student> students=new HashMap<>();
		students.put(s1.getRollno(), s1);
		students.put(s2.getRollno(), s2);
		students.put(s3.getRollno(), s3);
		students.put(s4.getRollno(), s4);
		
		Iterator<Student>itr=students.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getRollno()<=1073) {
				itr.remove();
			}
		}
		students.values().forEach(x->System.out.println(x));
	}
	

}
