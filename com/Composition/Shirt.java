package com.Composition;

public class Shirt {
	public String brand;
	public String color;
	public int price;
	public Button button;
	
	public void setbrand(String brand) {
		this.brand = brand;
	}
	public String getbrand() {
		return this.brand;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	public String getcolor() {
		return this.color;
	}
	
	public void setprice(int price) {
		this.price = price;
	}
	public int getprice() {
		return this.price;
	}
	public void setButton(Button button) {
		this.button = button;
	}
	public Button getButton() {
		return this.button;
	}
	
}
