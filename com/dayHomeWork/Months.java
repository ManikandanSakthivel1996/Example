package com.dayHomeWork;

public class Months {
	public static void main(String[] args) {
		String month = args[0];
		month.toLowerCase();
		month.toLowerCase().length();
		switch(month) {
		case "january":System.out.println("january");
		break;
		case "february":System.out.println("february");
		break;
		case "march":System.out.println("march");
		break;
		case "april":System.out.println("april");
		break;
		case "may":System.out.println("may");
		break;
		case "june":System.out.println("june");
		break;
		case "july":System.out.println("july");
		break;
		case "august":System.out.println("august");
		break;
		case "september":System.out.println("september");
		break;
		case "october":System.out.println("october");
		break;
		case "november":System.out.println("november");
		break;
		case "december":System.out.println("december");
		break;
		default:System.out.println("you have entered wrong month number");
		break;
		}
	}

}
