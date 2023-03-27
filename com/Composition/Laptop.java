package com.Composition;

public class Laptop {
	private String brand;
	private String model;
	private int price;
	private Display display;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return this.brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}
	public Display getDisplay() {
		return this.display;
	}
	
	public Laptop(String brand,String model,int price, Display display) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.display = display;
	}
	public String toString() {
		return"brand="+brand+" model="+model+" price="+price+" Display="+display.size;
	}

}
