
public abstract class Vehicle {
	public String getMileage(int mileage) {
		return "mileage "+mileage;
	}
	public String engineCc(int cc) {
		if (cc<150) {
		return "90km speed"+cc;
	}
		else if(cc>180){
			return "120km speed"+cc;
		}
		else {
			return "150km speed"+cc;
	}
	}
	public abstract String showSpeed(int speed);
	}

