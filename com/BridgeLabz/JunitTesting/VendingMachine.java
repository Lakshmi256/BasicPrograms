package com.BridgeLabz.JunitTesting;
import java.util.Scanner;
public class VendingMachine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the cash required");
Scanner a=new Scanner(System.in);
int cash=a.nextInt();
a.close();
int arr[]=new int[] {1000,500,100,50,10,5,2,1};
for (int i=0;i<arr.length;i++)
{
if (cash>=arr[i]);
{
int x=cash/arr[i];
cash=cash%arr[i];
System.out.println(arr[i]+" notes:"+x);
}
}
}
}