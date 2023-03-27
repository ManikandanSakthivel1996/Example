package comCondition.day5;

public class WaterBottle {
	public static void main(String[] args) {
		Bottles bottle1 = new Bottles();
		Bottles bottle2 = new Bottles();
		bottle1.material = "plastic";
		bottle1.capacity = 2;
		bottle1.colour = "BLUE";
		bottle1.price = 10;
		
		bottle2.material = "copper";
		bottle2.capacity = 4;
		bottle2.colour = "green";
		bottle2.price = 20;
		
		if (bottle1.material == bottle2.material) {
		System.out.println("Yes it is");
		}
		else if(bottle1.material.equalsIgnoreCase("plastic")) {
		System.out.println();
		}
		else if(bottle2.material.equalsIgnoreCase("copper")) {
			System.out.println("no its not");
			}
		else {
			System.out.println("out of stock");
		}
			
		
	}	
}
