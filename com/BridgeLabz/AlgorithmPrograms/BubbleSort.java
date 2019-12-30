package com.BridgeLabz.AlgorithmPrograms;
//purpose: To sort a string using bubble sort.


import com.BridgeLabz.utility.Util;

public class BubbleSort {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[5];

System.out.println("enter length of string");
int n=Util.readInt();
for(int i=0;i<n;i++)
{
	arr[i]=Util.readInt();
}
Util.bubblesort(arr);
for (int i=0;i<n;i++)
{
	System.out.print(arr[i]+" ");
}
	}

}
