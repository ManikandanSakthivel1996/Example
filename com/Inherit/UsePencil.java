package com.Inherit;

public class UsePencil {
	public static void main(String[] args) {
		Pencil p = new Pencil();
		p.brand = "camalin";
		p.color = "red";
		p.name = "xs";
		p.price = 10;
		
		if(p.color.contains("a")||p.color.contains("e")||p.color.contains("i")
				||p.color.contains("o")||p.color.contains("u")) {
			System.out.println("red color");	
		}
		else {
			System.out.println("Black color");
		}
	}

}
