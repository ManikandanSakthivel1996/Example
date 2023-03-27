package Collect3;
import java.util.*;
import java.util.stream.Collectors;

public class UseWatch {
	public static void main(String[] args) {
		Watch w1 = new Watch("rolex","blue",2500,true);
		Watch w2 = new Watch("titan","black",3500,true);
		Watch w3 = new Watch("tata","green",1500,false);
		Watch w4 = new Watch("digi","blue",2500,true);
		Watch w5 = new Watch("trend","white",4500,false);
		Watch w6 = new Watch("ranger","grey",5500,true);
		Watch w7 = new Watch("trex","yellow",3500,false);
		Watch w8 = new Watch("ander","blue",21500,true);
		
		ArrayList<Watch> watches = new ArrayList<>();
		watches.add(w1);
		watches.add(w2);
		watches.add(w3);
		watches.add(w4);
		watches.add(w5);
		watches.add(w6);
		watches.add(w7);
		watches.add(w8);
		//watches.stream().filter(x->x.getIsAnalog()==true).forEach(y->System.out.println(y));
		//watches.stream().map(x->x.getBrand()).forEach(y->System.out.println(y));
	     // watches.stream().filter(x->x.getBrand()).map(x->x.getColor()).forEach(x->System.out.println(x));
	      //watches.stream().filter(x->x.getPrice()>1500).map(x->x.getBrand().charAt(1)).forEach(y->System.out.println(y));
	     //long count= watches.stream().filter(x->x.getColor().equals("black")).count();
		 //System.out.println("The count of black watches is "+ count);
	      List<Integer>w = watches.stream().map(x->x.getPrice()).sorted(Comparator.comparingDouble()).reversed()).collect(Collectors.toList());
	}

}
