package com.BridgeLabz.JunitTesting;
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the d m and y values");
Scanner a=new Scanner(System.in);
double d=a.nextInt();
double m=a.nextInt();
double y=a.nextInt();
double y1,x,m0,d0;
y1=y-((14-m)/12);
x=y1+y1/4-y1/100+y1/400;
m0=m+(12*((14-m)/12)-2);
d0=(d+(x*31*m0)/12)%7;
int day=(int)d0;
	System.out.println(day);
	}

}
