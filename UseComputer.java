
public class UseComputer {
	public static void main(String[] args) {
		Computer c = new Computer();
		System.out.println(c.findName("mani"));
		System.out.println(c.findPrice(100));
		System.out.println(c.findGender(true));
	}
}

 interface Systems {
	public String findName(String name);
	public String findPrice(int age);
	public String findGender(boolean gender);
}

abstract class windows implements Systems {
	public String findName(String name) {
		return name;
	}
	public String findPrice(int age) {
		return "age "+age;
	}
	
}

class Computer extends windows {
	public String findGender(boolean gender) {
		return "gender "+gender;
	}

}


