package com.BridgeLabz.JunitTesting;
//purpose: to solve the monthly payment to be paid every month.


import com.BridgeLabz.utility.Util;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("enter the principal amount");
	double p=Util.readdouble();
	System.out.println("enter the rate of intrest");
	double r=Util.readdouble();
	System.out.println("enter the time in years");
	double t=Util.readdouble();
	Util.month(p, r, t);

	}

}
