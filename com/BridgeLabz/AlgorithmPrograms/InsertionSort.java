package com.BridgeLabz.AlgorithmPrograms;
import java.util.Scanner;
public class InsertionSort {
public static void insertion(String arr[],int n) {
	for (int i=1;i<n;i++)
	{
		String key=arr[i];
		int j=i-1;
		while (j>=0 && arr[j].compareTo(key)>0)
		{
			arr[j+1]=arr[j];
			j=j-1;
			
		}
arr[j+1]=key;	
	}}
	public static void printarray(String arr[],int n) {
for (int i=0;i<n;i++)
{
	System.out.println(arr[i]+" ");
}
	}
public static void main(String args[]) {
	String[] arr=new String[10];
	Scanner a=new Scanner(System.in);
	int n=a.nextInt();
	a.close();
	for(int i=0;i<n;i++)
	{
		 	arr[i]=a.next();
	}
	insertion(arr,n);
	printarray(arr,arr.length);
}
	

}