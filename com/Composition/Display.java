package com.Composition;

public class Display {
	double size;
	String type;
	
	public void setsize(double size) {
		this.size = size;
	}
	public double getsize() {
		return this.size;
	}
	
	public void settype(String type) {
		this.type = type;
	}
	public String gettype() {
		return this.type;
	}
	public Display(double size,String type) {
		this.size = size;
		this.type = type;
	}

}
