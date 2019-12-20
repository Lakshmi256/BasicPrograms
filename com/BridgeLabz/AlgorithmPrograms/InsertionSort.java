package com.BridgeLabz.AlgorithmPrograms;

import com.BridgeLabz.utility.Util;

public class InsertionSort {

public static void main(String args[]) {
	String[] arr=new String[10];
	
	int n=Util.readInt();

	for(int i=0;i<n;i++)
	{
		 	arr[i]=Util.readString();
	}
	Util.insertion(arr,n);
	Util.printarray(arr,arr.length);
}
	

}