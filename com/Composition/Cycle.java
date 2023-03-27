package com.Composition;

public class Cycle {
	private String brand;
	private int price;
	private String color;
	private Carrier carrier;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setCarrier(Carrier carrier) {
		this.carrier=carrier;
	}
	public Carrier getCarrier() {
		return carrier;
	}
	public Cycle(String brand,String color,int price,Carrier carrier) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.carrier=carrier;
	}
	
}
