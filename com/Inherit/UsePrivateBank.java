package com.Inherit;

public class UsePrivateBank {
	public static void main(String[] args) {
		PrivateBank axis = new  PrivateBank();
		axis.branchcode = 1234;
		axis.Ifsc = 275442;
		axis.mobileNo = 9952976247l;
		axis.intrest = 350000;
		
		System.out.println(axis.LoanInterestAmount(1000));
	}

}
