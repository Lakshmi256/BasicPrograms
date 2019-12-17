package com.Bridge.Labz.AlgorithmPrograms;
import java.util.Scanner;
public class BubbleSort {

	public static int bubblesort(int arr[]) {
		 int n = arr.length,temp = 0; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (arr[j] > arr[j+1]) 
	                { 
	         
	                     temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	        
	               }
			return temp; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[5];
Scanner a=new Scanner(System.in);
System.out.println("enter length of string");
int n=a.nextInt();
for(int i=0;i<n;i++)
{
	arr[i]=a.nextInt();
}
bubblesort(arr);
for (int i=0;i<n;i++)
{
	System.out.print(arr[i]+" ");
}
	}

}
