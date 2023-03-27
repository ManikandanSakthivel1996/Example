package com.dayFor3;

public class Useshirt {
	public static void main(String[] args) {
		shirt s1 = new shirt();
		s1.brand = "a";
		s1.price = 250;
		s1.ischecked = true;
		s1.discountAmount = 10;
		
		shirt s2 = new shirt();
		s2.brand = "a";
		s2.price = 300;
		s2.ischecked = false;
		s2.discountAmount = 10;
		
		shirt s3 = new shirt();
		s3.brand = "a";
		s3.price = 400;
		s3.ischecked = true;
		s3.discountAmount = 10;
		
		shirt s4 = new shirt();
		s4.brand = "a";
		s4.price = 40;
		s4.ischecked = false;
		s4.discountAmount = 10;
		
		shirt s5 = new shirt();
		s5.brand = "a";
		s5.price = 30;
		s5.ischecked = true;
		s5.discountAmount = 10;
		
		shirt[] sh = {s1,s2,s3,s4,s5};
		for(shirt x:sh) {
			if(x.ischecked==true) {
				System.out.println(x.price-x.discountAmount);
			}
		}
	}

}
