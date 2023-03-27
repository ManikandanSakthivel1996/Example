package com.Composition;

public class UseBus {
	public static void main(String[] args) {
		Engine1 e = new Engine1();
		e.setbrand("ford");
		e.setfueltype("petrol");

		Bus b = new Bus();
		b.setbrand("audi");
		b.setcolor("blue");
		b.setprice(2500000);
		b.setEngine1(e);

		System.out.println(b.getbrand() + "," + b.getcolor() + "," + b.getprice() + "\n" + b.getEngine1().getbrand()
				+ "," + b.getEngine1().getfueltype());

	}

}
