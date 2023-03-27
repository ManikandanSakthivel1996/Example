package Poly;

public class Maximum {
	public String findmax(int a) {
		if(a>100) {
			return a+" is maximum";
		}
		else {
			return a+" is not maximm to compare value";
		}
	}
	public String findmax (String[] a){
		int max=a.length;
		String temp="";
		for(String x:a) {
			if(x.length()>=max) {
				max=x.length();
				temp=x;
			}
		}
		return temp;
	}

}
