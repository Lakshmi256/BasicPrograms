package com.BridgeLabz.AlgorithmPrograms;
import com.BridgeLabz.utility.Util;
public class BinarySearch {
	public static void main(String[] args) {
	int n=Util.readInt();
	String arr[]=new String[n];
	System.out.println("enter the string");
	for(int i=0;i<n;i++)
	{
	   arr[i]=Util.readString();
	System.out.println("enter the word to search");
	String x=Util.readString();
	int result = Util.binarySearch(arr, x); 
	  
    if (result == -1) 
        System.out.println("Element not present"); 
    else
        System.out.println("Element found at "
                          + "index " + result); 
	}}
	}
