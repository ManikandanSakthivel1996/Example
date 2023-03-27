package com.Composition;

public class Bus {
	private String brand;
	private String color;
	private int price;
	private Engine1 engine;

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public String getbrand() {
		return brand;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public String getcolor() {
		return color;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public int getprice() {
		return price;
	}

	public void setEngine1(Engine1 engine) {
		this.engine = engine;
	}

	public Engine1 getEngine1() {
		return this.engine;
	}

}
