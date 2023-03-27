package com.Composition;

public class UseCamera {
	public static void main(String[] args) {
		Memory m1 = new Memory();
		m1.brand = "sandisk";
		m1.color = "red";
		m1.storage = "32gb";
		
		Camera cam1 = new Camera();
		cam1.brand = "Konica";
		cam1.color = "black";
		cam1.price = 50000;
		cam1.memory = m1;
		System.out.println(cam1.brand+","+cam1.color+","+cam1.price+"\n"+cam1.memory.brand+","+cam1.memory.color+","+cam1.memory.storage);
	}

}
