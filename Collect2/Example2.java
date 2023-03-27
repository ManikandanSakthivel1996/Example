package Collect2;

import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(26,"mani");
		hm.put(25,"mathan");
		hm.put(24,"VIJI");
		hm.put(25,"ratan");
		hm.put(27,"babu");
		int max = 0;
		for(Integer age :hm.keySet()) {
			if(age>max) {
				max=age;
			}
		}
				//System.out.println(hm.get(max).toUpperCase());
				int min = 26;
				String a =" ";
				for(Integer age:hm.keySet()) {
					if(age<min) {
						min=age;
						a=hm.get(age);
					}
				}
				System.out.println(a.toLowerCase());
				
				for(String x : hm.values()) {
					if(x.length()%2==0) {
					System.out.println(x);
					}
				}
	}
}
