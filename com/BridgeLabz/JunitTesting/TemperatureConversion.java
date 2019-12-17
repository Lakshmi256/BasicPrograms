package com.BridgeLabz.JunitTesting;
import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
System.out.println("enetr the temperature");
double T=a.nextDouble();
System.out.println("if c type 1 else 0");
int x=a.nextInt();
if (x==0)
{
	double sum=(T*9/5)+32;
	System.out.println("C to F c"+sum);
}
else
{
	double sum=(T-32)*5/9;
	System.out.println("F to C :"+sum);
}
	}

}
