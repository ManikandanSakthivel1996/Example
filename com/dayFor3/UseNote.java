package com.dayFor3;

public class UseNote {
	public static void main(String[] args) {
		Note n1 = new Note();
		n1.brand = "konar";
		n1.isRolled = true;
		n1.price = 90;
		n1.noOfPage = 180;
		
		Note n2 = new Note();
		n2.brand = "konar";
		n2.isRolled = false;
		n2.price = 90;
		n2.noOfPage = 180;
		
		Note n3 = new Note();
		n3.brand = "r";
		n3.isRolled = true;
		n3.price = 90;
		n3.noOfPage = 180;
		
		Note n4 = new Note();
		n4.brand = "k";
		n4.isRolled = false;
		n4.price = 90;
		n4.noOfPage = 180;
		
		Note n5 = new Note();
		n5.brand = "nar";
		n5.isRolled = true;
		n5.price = 930;
		n5.noOfPage = 180;
		
		Note[] note = {n1,n2,n3,n4,n5};
		for(Note x:note) {
			if(x.isRolled==true) {
				System.out.println(x.brand+" "+x.noOfPage+" "+x.price+" "+x.isRolled);
			}
		}
	}

}
