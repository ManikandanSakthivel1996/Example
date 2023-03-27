package com.dayFor3;

public class UseIronBox {
	public static void main(String[] args) {
		IronBox i1 = new IronBox();
		i1.brand = "a";
		i1.price = 380;
		i1.colour = "red";
		i1.isSteam = true;
		
		IronBox i2 = new IronBox();
		i2.brand = "b";
		i2.price = 1000;
		i2.colour = "blue";
		i2.isSteam = false;
		
		IronBox i3 = new IronBox();
		i3.brand = "c";
		i3.price = 580;
		i3.colour = "black";
		i3.isSteam = true;
		
		IronBox i4 = new IronBox();
		i4.brand = "d";
		i4.price = 680;
		i4.colour = "green";
		i4.isSteam = false;
		
		IronBox i5 = new IronBox();
		i5.brand = "a";
		i5.price = 380;
		i5.colour = "white";
		i5.isSteam = true;
		IronBox[] iron = {i1,i2,i3,i4,i5};
		IronBox a = null;
		int max = iron[0].price;
		for(IronBox x:iron) {
			if(x.price>max) {
				max=x.price;
				a=x;
			}
		}
		System.out.println(max);
		System.out.println(a.brand+" "+a.colour+" "+a.price+" "+a.isSteam);
	}

}
