package com.BridgeLabz.AlgorithmPrograms;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	
	int n=a.nextInt();
	String arr[]=new String[n];
	System.out.println("enter the string");
	for(int i=0;i<n;i++)
	{
	   arr[i]=a.nextLine();
	}
	System.out.println("enter the word to search");
	String x=a.nextLine();
	int result = binarySearch(arr, x); 
	  
    if (result == -1) 
        System.out.println("Element not present"); 
    else
        System.out.println("Element found at "
                          + "index " + result); 
	}
	
	static int binarySearch(String[] arr, String x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
            int res = x.compareTo(arr[m]);  
            if (res == 0) 
                return m;  
            if (res > 0) 
                l = m + 1; 
            else
                r = m - 1; 
        } 
  
        return -1; 
    }
	}
