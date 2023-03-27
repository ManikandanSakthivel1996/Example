package com.Inherit;

public class Scale extends StationaryProduct {
	String material;
	
	public String Material(String material) { 
		
	if(material.equalsIgnoreCase("Steel")) {
		return "long term use";
	}
	else {
		return "short term use";
	}
	
	}
}


