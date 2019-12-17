package com.Bridge.Labz.AlgorithmPrograms;

import java.util.Scanner;

public class FindYourNumber {

	public static void fyn(int arr[]) {
		  int l = 0, r = arr.length; 
	        while (l <= r) { 
	            int m = l + (r - l) / 2; 
	System.out.println("if "+arr[m]+" is your number enter 1 else o");
	Scanner a=new Scanner(System.in);
	int x=a.nextInt();
	a.close();
	if (x==0)
	{
		System.out.println("if"+arr[m]+"is greather than your number enter 1 else o");
		int y=a.nextInt();
		if (y==1)
		       l = m + 1; 
        else
            r = m - 1;
	}
	else 
	{
		System.out.println("number found "+arr[m]);
	}
	        }
	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[64];
		for (int i=0;i<64;i++)
{
	arr[i]=i;
}
		fyn(arr);
	}

}
