package com.dayExceptionClass;

public class UseShirt {
	public static void main(String[] args) throws PriceException{
	Shirt s1 = new Shirt("otto",1500,"red",'m');
	Shirt s2 = new Shirt("ramraj",1000,"red",'l');
	Shirt s3 = new Shirt("akzan",700,"red",'s');
	Shirt s4 = new Shirt("nike",500,"red",'m');
	Shirt[] shirts = {s1,s2,s3,s4};
	int max = shirts[0].getPrice();
	for(int i=0;i<shirts.length;i++) {
		if(shirts[i].getPrice()>max) {
			max=shirts[i].getPrice();
		}
	}
	System.out.println(max);
	try {
		if(max==1500) {
			throw new PriceException("shirt is not avilable");
		}
		else {
			System.out.println("avilable");
		}
		}
		catch(PriceException n) {
			n.getMessage();
			//n.printStackTrace();
		}
}

}
