package com.BridgeLabz.AlgorithmPrograms;
import java.util.Arrays;
public class AnagramsandPallindrome {
		static  boolean isPrime(int n)
	    { 
	        if (n <= 1) 
	            return false; 
	   	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false;  
	        return true;
	    } 
static boolean ispallindrome(int n)
{
	int x=n,reversed=0;
	while(x!= 0) {
        int digit = x % 10;
        reversed = reversed * 10 + digit;
        x /= 10;
	}
	if( n==reversed)
		return true;
	return false;	
	}
static boolean areAnagram(char[] str1, char[] str2) 
{ 
    int n1 = str1.length; 
    int n2 = str2.length; 
    if (n1 != n2) 
        return false; 
    Arrays.sort(str1); 
    Arrays.sort(str2); 
    for (int i = 0; i < n1; i++) 
        if (str1[i] != str2[i]) 
            return false; 
    return true; 
} 
	public static void main(String[] args) {
int[] arr=new int[1000];
int l=0;
		for (int n=0;n<1000;n++)
			{
		boolean a=isPrime(n);
	if (a==true) 
	{
	arr[l]=n;
	l++;
	}
	}
		System.out.println("the prime numbers are:");
		for(int i=0;i<l;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
		System.out.println("the pallimdrome numbers are:");
		for(int i=0;i<l;i++)
		{
			if( ispallindrome(arr[i])==true)
			{
			System.out.print(" "+arr[i]);
		}}
		System.out.println(" ");
		System.out.println("the anagram numbers are");
		for (int k=0;k<l;k++)
				for(int m=k+1;m<l;m++)
				{
					char[] x=("" + arr[k]).toCharArray();
					char[] y=("" + arr[m]).toCharArray();
				if(	(areAnagram(x,y))==true) 
			
				{
					System.out.print(" "+arr[k]+" "+arr[m]+" ");
				}
			}
		}
	}