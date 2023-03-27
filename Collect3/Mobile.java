package Collect3;

public class Mobile {
	private String brand;
	private int price;
	private int ram;
	private String os;
	private boolean isAndroid;
	
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
	public void setRam(int ram) {
		this.ram=ram;
	}
	public int getRam() {
		return ram;
	}
	public void setOs(String os) {
		this.os=os;
	}
	public String getOs() {
		return os;
	}
	public void setIsAndroid(boolean isAndroid) {
		this.isAndroid=isAndroid;
	}
	public boolean getIsAndroid() {
		return isAndroid;
	}
	public Mobile(String brand, int price, int ram, String os, boolean isAndroid) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.os = os;
		this.isAndroid = isAndroid;
	}
	public String toString() {
		return brand+" "+price+" "+ram+" "+os+" "+isAndroid;
	}
	
}
