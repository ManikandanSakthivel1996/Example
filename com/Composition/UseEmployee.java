package com.Composition;

public class UseEmployee {
	public static void main(String[] args) {
		Address a1 = new Address();
		a1.doorNo = 1;
		a1.address = "Redhills";
		a1.place = "Thiruvallur";
		Employee e1 = new Employee();
		e1.name = "sundar";
		e1.age = 31;
		e1.mobileNo = 9847579373l;
		e1.address = a1;
		
		
		Address a2 = new Address();
		a2.doorNo = 4;
		a2.address = "AnnaNagar";
		a2.place = "Chennai";
		Employee e2 = new Employee();
		e2.name = "rajan";
		e2.age = 32;
		e2.mobileNo = 9847559343l;
		e2.address = a2;
		
		Address a3 = new Address();
		a3.doorNo = 6;
		a3.address = "Vinayagapuram";
		a3.place = "Chennai";
		Employee e3 = new Employee();
		e3.name = "sundar";
		e3.age = 31;
		e3.mobileNo = 9894760132l;
		e3.address = a3;
		
		Employee[] es = {e1,e2,e3};
		for(int i=0;i<es.length;i++) {
			if(es[i].address.place.contains("Chennai")) {
				System.out.println(es[i].address.doorNo+","+es[i].address.address+","+es[i].address.place);
			}
		}
	}

}
