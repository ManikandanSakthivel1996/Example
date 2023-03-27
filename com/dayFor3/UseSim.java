package com.dayFor3;

public class UseSim {
	public static void main(String[] args) {
		Sim s1 = new Sim();
		s1.companyName = "airtel";
		s1.simNumber= 9878264764f;
		s1.is4G = true;
		s1.candidateName = "a";
		
		Sim s2 = new Sim();
		s2.companyName = "vodafone";
		s2.simNumber= 9878264764f;
		s2.is4G = false;
		s2.candidateName = "b";
		
		Sim s3 = new Sim();
		s3.companyName = "idea";
		s3.simNumber= 9878264764f;
		s3.is4G = true;
		s3.candidateName = "c";
		
		Sim s4 = new Sim();
		s4.companyName = "aircel";
		s4.simNumber= 9878264764f;
		s4.is4G = false;
		s4.candidateName = "d";
		
		Sim s5 = new Sim();
		s5.companyName = "docomo";
		s5.simNumber= 9878264764f;
		s5.is4G = true;
		s5.candidateName = "e";
		
		Sim[] sim = {s1,s2,s3,s4,s5};
		Sim card = null;
		for(Sim x:sim) {
			if(x.companyName.contains("a")||
					x.companyName.contains("e")||
					x.companyName.contains("i")||
					x.companyName.contains("o")||
					x.companyName.contains("u")) {
				System.out.println(x.candidateName.toUpperCase()+" "+x.companyName.toUpperCase());
			}
		}
	}
}
