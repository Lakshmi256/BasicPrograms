package com.BridgeLabz.DataStructures;
//purpose:To find the possible number of ways in a binary search tree.


import com.BridgeLabz.utility.Util;
public class BinaryTree {
	//created to find the factroial of a num.
public static double fact(double x)
{
	if (x==1)
		return 1;
	else
		return(x*fact(x-1));
	
}
	public static void main(String[] args) {	
double n=Util.readdouble();
double sum=fact(2*n)/(fact(n+1)*fact(n));//equation for the nodes in binary search tree.
System.out.println(sum);
}
}
