package com.BridgeLabz.JunitTesting;

import java.util.Scanner;

public class ToBinary {
	static void tobin(int n)
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
System.out.println("enter the number ");
int n=a.nextInt();
tobin(n);
a.close();
	}

}
