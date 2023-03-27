package com.dayFor3;

public class Fruit {
	public static void main(String[] args) {
		Fruits f1 = new Fruits();
		f1.name = "tata";
		f1.price = 150;
		f1.IsHybrid = true;
		
		Fruits f2 = new Fruits();
		f2.name = "Apple";
		f2.price = 260;
		f2.IsHybrid = false;
		
		Fruits f3 = new Fruits();
		f3.name = "orange";
		f3.price = 370;
		f3.IsHybrid = true;
		
		Fruits f4 = new Fruits();
		f4.name = "grapes";
		f4.price = 480;
		f4.IsHybrid = false;
		
		Fruits f5 = new Fruits();
		f5.name = "banana";
		f5.price = 590;
		f5.IsHybrid = true;
		
		Fruits f6 = new Fruits();
		f6.name = "jackfruit";
		f6.price = 600;
		f6.IsHybrid = false;
		
		Fruits f7 = new Fruits();
		f7.name = "strawberry";
		f7.price = 710;
		f7.IsHybrid = true;
		
	Fruits[] frs = {f1,f2,f3,f4,f5,f6,f7};
	for(Fruits x:frs) {
		System.out.println(x.name.charAt(0));
	}
	}

}
