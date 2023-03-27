package com.dayFunctions;

public class Weekdays {
	public void days(String b) {
	String a1 ="monday";
		switch (a1)
		{
		case "Sunday":System.out.println("day1");
		break;
		case "monday":System.out.println("day2");
		break;
		case "tuesday":System.out.println("day3");
		break;
		case "wednesday":System.out.println("day4");
		break;
		case "thursday":System.out.println("day5");
		break;
		case "friday":System.out.println("day6");
		break;
		case "Saturday":System.out.println("day1");
		break;
		default:System.out.println("no");
		break;
		}
}
		
	public static void main (String[] args) {
		Weekdays a = new Weekdays();
		a.days("sunday");
		
	}

}
