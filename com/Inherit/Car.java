package com.Inherit;

public class Car extends Vehicle{
	private boolean isAutomatic;
	
	 public void setIsAutomatic() {
		 this.isAutomatic=isAutomatic;
	 }
	 public boolean getIsAutomatic() {
		 return isAutomatic;
	 }
	 
	 public Car(boolean isAutomatic,String brand,int price,String color) {
		super(brand,price,color);
		 this.isAutomatic=isAutomatic;
	 }
	 public String toString() {
		 return isAutomatic +" "+super.toString();
	 }

}
