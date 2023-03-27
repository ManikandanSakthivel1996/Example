package com.Inherit;

public class Bank {
	String name;
	String location;
	
	public String LoanInterestAmount(int principleAmount) {
		return "LoanIntrestAmount ="+principleAmount*10/100;
	}

}
