package com.dayFor3;

public class UseWatch {
	public static void main(String[] args) {
		Watch w1 = new Watch();
		w1.brand="a";
		w1.price= 500;
		w1.issmart= true;
		w1.colour ="red";
		
		Watch w2 = new Watch();
		w2.brand="b";
		w2.price= 600;
		w2.issmart= false;
		w2.colour ="blue";
		
		Watch w3 = new Watch();
		w3.brand="c";
		w3.price= 700;
		w3.issmart= true;
		w3.colour ="black";
		
		Watch w4 = new Watch();
		w4.brand="d";
		w4.price= 800;
		w4.issmart= false;
		w4.colour ="green";
		
		Watch w5 = new Watch();
		w5.brand="e";
		w5.price= 900;
		w5.issmart= true;
		w5.colour ="white";
		
		Watch[] watches = {w1,w2,w3,w4,w5};
		int min = watches[0].price;
		for(Watch x:watches) {
			if(x.price<=min) {
				System.out.println(x.price+x.price*10/100);
			}
		}
	}

}
