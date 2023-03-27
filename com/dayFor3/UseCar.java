package com.dayFor3;

public class UseCar {
	public static void main(String[] args) {
		
		String[] a = args[0].split(",");
		String[] b = args[1].split(",");
		String[] c = args[2].split(",");
		
		Car car1 = new Car();
		car1.price = Integer.parseInt(a[0]);
		car1.distance = Integer.parseInt(a[1]);
		car1.netprice = car1.price-car1.distance;
		
		Car car2 = new Car();
		car2.price = Integer.parseInt(b[0]);
		car2.distance = Integer.parseInt(b[1]);
		car2.netprice = car2.price-car2.distance;
	
		Car car3 = new Car();
		car3.price = Integer.parseInt(c[0]);
		car3.distance = Integer.parseInt(c[1]);
		car3.netprice = car3.price-car3.distance;
	

		 
		Car[] cars = {car1,car2,car3};
		int min=cars[0].netprice;
		Car d = null;
	     for(int i=1;i<cars.length;i++) {
	    	 if(cars[i].netprice<=min) {
	    		 min=cars[i].netprice;
	    		 d=cars[i];
	    	 }
	     }
		
	     System.out.println("Minimum: "+d.distance+" "+d.price);
		
	}

}
