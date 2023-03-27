package Collect;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {

public static void main(String[] args) {
		
		Employee e1 = new Employee("mani",26,"Male",26000);
		Employee e2 = new Employee("mathan",25,"Male",25000);
		Employee e3 = new Employee("ram",37,"Male",37000);
		Employee e4 = new Employee("sheela",36,"Female",35000);
		Employee e5 = new Employee("rithu",28,"Female",28000);
		Employee e6 = new Employee("sowmiya",38,"Female",38000);
		Employee e7 = new Employee("shankar",22,"Male",22000);
		
		ArrayList<Employee> Employees = new ArrayList<>();
		Employees.add(e1);
		Employees.add(e2);
		Employees.add(e3);
		Employees.add(e4);
		Employees.add(e5);
		Employees.add(e6);
		Employees.add(e7);
		
	  
		int min = e1.getSalary();
		Employee a = Employees.get(0);
		for(Employee x:Employees){
			if(x.getSalary()<=min) {
				x.setSalary(min+min*4/100);
				min=x.getSalary();
				a=x;
			}
		}
		//System.out.println(a);
		//List<Employee>emp = Employees.stream().collect(Collectors.toList());
		//emp.forEach(x->System.out.println(x));
//List		
		List<Employee> emps = new ArrayList<>();
		for(Employee x :Employees) {
			emps.add(x);
		}
		emps.forEach(x->System.out.println(x));
//names		
		List<String>names = new ArrayList<>();
		for(Employee y :Employees) {
			names.add(y.getName());
		}
		names.forEach(x->System.out.println(x));
//age
		List<Integer>ages=new ArrayList<>();
		for(Employee z :Employees) {
			ages.add(z.getAge());
		}
		ages.forEach(x->System.out.println(x));
//character
		List<Character>nms =new ArrayList<>();
		for(Employee b : Employees) {
			nms.add(b.getName().charAt(b.getName().length()-1));
		}
		nms.forEach(x->System.out.println(x));
//List MaleName
		List<String>names1 = new ArrayList();
		for(Employee c :Employees) {
			names1.add(c.MaleName("Male"));
		}
		names1.forEach(x->System.out.println(x));
		
		}
}

