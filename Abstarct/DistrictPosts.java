package Abstarct;

public class DistrictPosts implements Post {
	public String findArea(String area) {
	return area;
}
	public String findAddress(int number) {
		if (number>10 && number<1) {
			return "v.o.c street";
		}
		else if (number>20 && number<1) {
			return "thiruvika Street";
		}
		else {
			return "rajan Street";
		}
	}
}
