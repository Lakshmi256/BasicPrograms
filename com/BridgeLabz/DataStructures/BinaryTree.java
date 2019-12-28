package com.BridgeLabz.DataStructures;
import com.BridgeLabz.utility.Util;
public class BinaryTree {
public static double fact(double x)
{
	if (x==1)
		return 1;
	else
		return(x*fact(x-1));
	
}
	public static void main(String[] args) {	
double n=Util.readdouble();
double sum=fact(2*n)/(fact(n+1)*fact(n));
System.out.println(sum);
	}
}
