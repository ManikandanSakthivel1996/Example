package com.Composition;

public class UseBike {
	public static void main(String[] args) {
		String[] a = args[0].split(",");
		String[] b = args[1].split(",");
		Engine2 r = new Engine2(a[0],a[1],Integer.parseInt(a[2]));
		Bike bike = new Bike(b[0],b[1],Integer.parseInt(b[2]),r);
		System.out.println(bike);
		}
}


    class Bike {
	private String brand;
	private String color;
	private int price;
    private Engine2 remote;
	
	public void setBrand (String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColor (String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setRemote (Engine2 remote) {
		this.remote=remote;
	}
	public Engine2 getRemote() {
		return remote;
	}
	public Bike(String brand,String color,int price,Engine2 remote){
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.remote=remote;
	}
	public String toString () {
		return "Brand: "+brand+", Color: "+color+", Price: "+price+", "+remote;
	}
	
}

class Engine2 {
	private String brand;
	private String color;
	private int price;
	
	public void setBrand (String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColor (String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice (int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public Engine2(String brand, String color,int price){
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	public String toString() {
		return "Brand: "+brand+", Color: "+color+", Price: "+price;
	}
}


