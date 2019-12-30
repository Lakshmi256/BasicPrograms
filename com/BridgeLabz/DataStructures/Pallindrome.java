package com.BridgeLabz.DataStructures;
//purpose: Program to find a pallindrome of a string using deque.


import com.BridgeLabz.utility.Util;
public class Pallindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Deque<String> ob=new Deque<String>();
		    System.out.println("Enter the String");
			String str=Util.readString();
			String[] arr=str.split("");
			for(int i=0;i<arr.length;i++)
			{
				ob.addRear(arr[i]);
			}
		    ob.displayForward();
			boolean b=ob.checkPalindrome();
			System.out.println();
			if(b==true)
				System.out.println("Is a Palindrome!");
			else
				System.out.println("Not a Palindrome!");
	}
}
