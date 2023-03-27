package com.Composition;

public class UseCycle {
	public static void main(String[] args) {
		Carrier carr1 = new Carrier("mtb",150,"black");
		Cycle cyc1 = new Cycle("Hercules",2500,"green",carr1);
		
		Carrier carr2 = new Carrier("radan",250,"black");
		Cycle cyc2 = new Cycle("Hercules",3000,"red",carr2);
		
		Carrier carr3 = new Carrier("mtb",150,"black");
		Cycle cyc3 = new Cycle("hero",3500,"grey",carr3);
		
		Cycle[] cycles = {cyc1,cyc2,cyc3};
		String read = null;
		int min = cycles[0].getPrice();
		for(int i=0;i<cycles.length;i++) {
			if(cycles[i].getPrice()<min) {
				min=cycles[i].getPrice();
			}
		}
		System.out.println("minimum price "+min);
	}

}
