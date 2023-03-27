package com.Composition;

public class UseShirt {
	public static void main(String[] args) {
		
	Button b = new Button();
	b.setcolor("white");
	b.settype("plastic");

	Shirt s = new Shirt();
	s.setbrand("superdry");
    s.setcolor("blue");
	s.setprice(250);
	s.setButton(b);

	System.out.println(s.getbrand() + "," + s.getcolor() + "," + s.getprice() + "\n" + s.getButton().getcolor()
			+ "," + s.getButton().gettype());
	}

}
