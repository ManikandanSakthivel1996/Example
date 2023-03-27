
public abstract class Child implements Human {
	public String findName(String name) {
		return "Name = "+name;
	}
	public String findAge(int age) {
		if(age<5) {
			return "You are child = "+age;
		}
		else if(age>10) {
			return "You are teen = "+age;
		}
		else {
			return "You are old";
		}
	}

}
