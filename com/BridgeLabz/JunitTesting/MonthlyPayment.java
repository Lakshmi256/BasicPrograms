package com.BridgeLabz.JunitTesting;
import java.util.Scanner;
import java.lang.Math;
public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
System.out.println("enter the principal amount");
	double p=a.nextDouble();
	System.out.println("enter the rate of intrest");
	double r=a.nextDouble();
	System.out.println("enter the time in years");
	double t=a.nextDouble();
	double n=12*t;
	double R=r/(12*100);
	double payment= (p*R)/(1-Math.pow((1+R),(-n)));
	System.out.println("the monthly payment is:"+payment);
	a.close();
	}

}
