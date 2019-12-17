package com.BridgeLabz.JunitTesting;
import java.util.Scanner;
import java.lang.Math;
public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
System.out.println("enter the number");
double num=a.nextDouble();
double t=num;
double epsilon=1.0e-15;
if (num>0)

{
	while(Math.abs(t-num/t)>epsilon*t)
	{
		 t=((num/t)+t)/2.0;
	}
	System.out.println("t="+t);

	}
else
{
	System.out.println("given number is negitive num");
	}
}}

