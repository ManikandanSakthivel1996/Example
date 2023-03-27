package com.dayExceptionClass;

public class MultiCatch {
	public static void main(String[] args) {
		try {
			String[] a= {"mani","mathan","raju"};
			System.out.println(a[4].charAt(4));
		}
		catch(StringIndexOutOfBoundsException s) {
			s.printStackTrace();
		}
		catch(IndexOutOfBoundsException i) {
			i.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
