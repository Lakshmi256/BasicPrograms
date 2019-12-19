package com.BridgeLabz.utility;

import java.util.Scanner;

public class Util {

	public static double distance(double x,double y)
	{
		double sum=Math.sqrt((x*x)-(y*y));
		return sum;
	}
	private static Scanner sc;
	static
	{
		sc=new Scanner(System.in);
		
	}
	public static  int readInt()
	{
		return sc.nextInt();
		
	}
	public static String readString()
	{
		return sc.nextLine();
	}
	public static  double readdouble()
	{
		return sc.nextDouble();
	}
	public static void  quad(double a,double b,double c)
	{
		double delta=(b*b)-(4*a*c);
		double x1=(-b)+ Math.sqrt(delta)/2*a;
		double x2=(-b)- Math.sqrt(delta)/2*a;
		System.out.println(x1+" "+x2);
	}
	public static void  wind(double t,double v)
	{
		if ((t>50)&&(v<120)&&(v>3))
		{
		double w=(35.74+0.6215*t+(0.4275*t-35.75))*Math.pow(v,0.6);
		System.out.println("the whind s=chill is :"+w);
		}
		else
		{
		System.out.println("invalid inputs");
		}
	}
	public static void  dayofweek(int d,int m,int y)
	{
		int y1,x,m0,d0;
		y1=y-((14-m)/12);
		x=y1+y1/4-y1/100+y1/400;
		m0=m+(12*((14-m)/12)-2);
		d0=(d+(x*31*m0)/12)%7;
		int day=(int)d0;
			System.out.println(day);
	}
	public static void  sqrt(double num)
	{
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
	}
	public static void  month(double p,double r,double t)
	{
		double n=12*t;
		double R=r/(12*100);
		double payment= (p*R)/(1-Math.pow((1+R),(-n)));
		System.out.println("the monthly payment is:"+payment);
	}
	public static void temp(int x,double T)
	{
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
	public static void tobin(int n)
	{
		int[] binnum=new int[1000];
		int i=0;
		while(n>0)
		{
			binnum[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
			System.out.print(binnum[j]);
	}

	public static void vend(int cash)
{
	int arr[]=new int[] {1000,500,100,50,10,5,2,1};
	for (int i=0;i<arr.length;i++)
	{
	if (cash>=arr[i]);
	{
	int x=cash/arr[i];
	cash=cash%arr[i];
	System.out.println(arr[i]+" notes:"+x);

}
	}}}
