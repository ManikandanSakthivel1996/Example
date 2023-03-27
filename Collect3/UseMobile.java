package Collect3;
import java.util.*;
import java.util.stream.Collectors;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("samsung",15000,6,"pie",true);
		Mobile m2 = new Mobile("nokia",15000,6,"windows",false);
		Mobile m3 = new Mobile("xiomi",15000,8,"kitkat",true);
		Mobile m4 = new Mobile("oppo",15000,4,"jellybean",true);
		Mobile m5 = new Mobile("vivo",15000,10,"android",false);
		Mobile m6 = new Mobile("sony",15000,8,"lolipop",true);
		Mobile m7 = new Mobile("apple",15000,12,"nauget",false);
		Mobile m8 = new Mobile("moto",15000,8,"marshmellow",true);
		
		HashMap<String,Mobile>mobiles = new HashMap<>();
		mobiles.put(m1.getBrand(),m1);
		mobiles.put(m2.getBrand(),m2);
		mobiles.put(m3.getBrand(),m3);
		mobiles.put(m4.getBrand(),m4);
		mobiles.put(m5.getBrand(),m5);
		mobiles.put(m6.getBrand(),m6);
		mobiles.put(m7.getBrand(),m7);
		mobiles.put(m8.getBrand(),m8);
		
		//List<Mobile>mobile = mobiles.values().stream().filter(x->x.getIsAndroid()==true && x.getRam()>6).collect(Collectors.toList());
		//mobile.forEach(x->System.out.println(x));
		//List<Mobile>mobile =mobiles.values().stream().collect(Collectors.toList());
		//mobile.forEach(x->System.out.println(x));
		
		Map<String,Mobile>mob=mobiles.values().stream().collect(Collectors.toMap(x->x.getBrand(),y->y));
		mob.values().forEach(y->System.out.println(y));
		mob.keySet().forEach(y->System.out.println(y));
		
	}

}
