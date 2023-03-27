package com.Composition;

public class UseCar {
	public static void main(String[] args) {
		Engine e1 = new Engine();
		e1.brand = "ford";
		e1.fueltype = "petrol";
		e1.noOfCyclinder = 4;
		
		Car c1 = new Car();
		c1.brand = "audi";
		c1.color = "blue";
		c1.model = "x2";
		c1.price = 2500000;
		c1.engine = e1;
		System.out.println(c1.brand+","+c1.color+","+c1.model+","+c1.price+"\n"+c1.engine.brand+","+c1.engine.fueltype+","+c1.engine.noOfCyclinder);//
	    System.out.println(c1);
	}

}
