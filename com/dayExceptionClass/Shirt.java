package com.dayExceptionClass;

public class Shirt {
	private String brand;
	private int price;
	private String color;
	private char size;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public Shirt(String brand, int price, String color, char size) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
	}
	public String toString() {
		return "Shirt [brand=" + brand + ", price=" + price + ", color=" + color + ", size=" + size + "]";
	}
}
