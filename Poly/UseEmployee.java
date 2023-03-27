package Poly;

public class UseEmployee {
	public static void main(String[] args) {
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		GovernmentEmployee g = new GovernmentEmployee();
		g.walk(name1);
		g.sleep(name2);
		g.eat(name3);
	}
}
class Human{
	public void walk(String name1) {
		System.out.println(name1);
	}
	public void sleep(String name2) {
		System.out.println(name2);
	}
	public void eat(String name3) {
		System.out.println(name3);
	}
	
}

class Employee extends Human{
}
class GovernmentEmployee extends Employee{
}

