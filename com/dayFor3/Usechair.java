package com.dayFor3;

public class Usechair {
	public static void main(String[] args) {
		Chair c1 = new Chair();
		c1.material = "a";
		c1.price = 380;
		c1.isflex = true;
		
		Chair c2 = new Chair();
		c2.material = "b";
		c2.price = 450;
		c2.isflex = false;
		
		Chair c3 = new Chair();
		c3.material = "c";
		c3.price = 400;
		c3.isflex = true;
		
		Chair c4 = new Chair();
		c4.material = "d";
		c4.price = 500;
		c4.isflex = false;
		
		Chair c5 = new Chair();
		c5.material = "e";
		c5.price = 600;
		c5.isflex = true;
		Chair[] chair = {c1,c2,c3,c4,c5};
		for(Chair X:chair) {
			if(X.isflex==true) {
				System.out.println(X.price-X.price*5/100);
			}
		}
	}

}
