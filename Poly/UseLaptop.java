package Poly;

public class UseLaptop {
	public static void main(String[] args) {
		String laptopName =args[0];
		int startingPrice = Integer.parseInt(args[1]);
		int endPrice = Integer.parseInt(args[2]);
		Laptop l = new Laptop();
		l.priceRange(laptopName, startingPrice);
		
		l.priceRange(laptopName, startingPrice, endPrice);
	}
}
class Laptop {
	
	//Overload
	public void priceRange(String laptopName,int startingPrice) {
		
		if(laptopName.equals(laptopName) && (startingPrice>=10000)) {
		System.out.println("Displayed");
		}
		else {
			System.out.println("invalid input");
		}
	}
	public void priceRange(String laptopName,int startingPrice,int endPrice) {
		if(laptopName.equals(laptopName) && (startingPrice>=10000) && (endPrice<90000)) {
		System.out.println("Displayed");
	}
	else {
		System.out.println("invalid input");
	}
	}
}
