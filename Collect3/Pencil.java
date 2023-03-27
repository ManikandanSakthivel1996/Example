package Collect3;

public class Pencil {
	private boolean isleadType;
	private int price;
	private String color;
	private float leadSize;
	
	public void setIsLeadType(boolean isleadType) {
		this.isleadType=isleadType;
	}
	public boolean getIsLeadType() {
		return isleadType;
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
	public void setLeadSize(float leadSize) {
		this.leadSize=leadSize;
	}
	public float getLeadSize() {
		return leadSize;
	}
	public Pencil(boolean isLeadType,int price,String color,float leadSize) {
		this.isleadType=isLeadType;
		this.price=price;
		this.color=color;
		this.leadSize=leadSize;
	}
	public String toString() {
		return isleadType+" "+price+" "+color+" "+leadSize;
	}
}


