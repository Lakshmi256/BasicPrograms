package com.BridgeLabz.DataStructures;

import com.BridgeLabz.utility.Util;

public class BinaryTree {
public static int bts(int x)
{
	int sum = 0,m=1,n=1;
		for(int i=0;i<x;i++)
		{
	
			{
				if ((i==0)||(i==1))
					m=1;
				m=bts(i);
				
					
				n=bts(x-1-i);
				sum=+ m*n;
				
	}}
	
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=Util.readInt();
System.out.println(bts(n));
	}

}
