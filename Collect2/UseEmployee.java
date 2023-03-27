package Collect2;

import java.util.*;

public class UseEmployee {
public static void main(String[] args) {
		
		Employee e1 = new Employee("mani",26,"Male",26000);
		Employee e2 = new Employee("mathan",25,"Male",25000);
		Employee e3 = new Employee("ram",37,"Male",37000);
		Employee e4 = new Employee("sheela",36,"Female",60000);
		Employee e5 = new Employee("rithu",28,"Female",28000);
		Employee e6 = new Employee("sowmiya",38,"Female",38000);
		Employee e7 = new Employee("shankar",22,"Male",22000);
		
		HashMap <Integer,Employee> Employees = new HashMap<>();
		Employees.put(e1.getId(),e1);
		Employees.put(e2.getId(),e2);
		Employees.put(e3.getId(),e3);
		Employees.put(e4.getId(),e4);
		Employees.put(e5.getId(),e5);
		Employees.put(e6.getId(),e6);
		Employees.put(e7.getId(),e7);
		
		for(Employee e : Employees.values()) {
			//System.out.println(e);
		}
		for(Integer e :Employees.keySet()) {
			//System.out.println(e);
			//System.out.println(Employees.get(e));
		}
		for(Employee e : Employees.values()) {
			if(e.getSalary()>=25000 && e.getSalary()<=45000  ) {
				e.setSalary(e.getSalary()+e.getSalary()*5/100);
				System.out.println(e.getName()+","+e.getSalary());
			}
			else if(e.getSalary()>=40000 && e.getSalary()<=60000  ) {
				e.setSalary(e.getSalary()+e.getSalary()*3/100);
				//System.out.println(e.getName()+","+e.getSalary());
				}
			else if (e.getSalary()>=60000) {
				//System.out.println(e.getName()+","+e.getSalary());
			}
        }

     }
  }
