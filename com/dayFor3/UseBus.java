package com.dayFor3;

public class UseBus {
	public static void main(String[] args) {
		Buses b1 = new Buses();
		b1.name = "tata";
		b1.price = 150;
		b1.IsSeat = true;
		
		Buses b2 = new Buses();
		b2.name = "Eicher";
		b2.price = 260;
		b2.IsSeat = false;
		
		Buses b3 = new Buses();
		b3.name = "Mahindra";
		b3.price = 370;
		b3.IsSeat = true;
		
		Buses b4 = new Buses();
		b4.name = "Force";
		b4.price = 480;
		b4.IsSeat = false;
		
		Buses b5 = new Buses();
		b5.name = "Benz";
		b5.price = 590;
		b5.IsSeat = true;
		
		Buses b6 = new Buses();
		b6.name = "radan";
		b6.price = 600;
		b6.IsSeat = false;
		
		Buses b7 = new Buses();
		b7.name = "BMW";
		b7.price = 710;
		b7.IsSeat = true;
		
		Buses[] buses = {b1,b2,b3,b4,b5,b6,b7};
		for(int i=0;i<buses.length;i++) {
			System.out.println(buses[i].name+" "+buses[i].price+" "+buses[i].IsSeat);
		}
		
	}

}
