package com.BridgeLabz.AlgorithmPrograms;

public class PrimeNumbers {
	static  boolean isPrime(int n)
    { 
        if (n <= 1) 
            return false; 
   	        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false;  
        return true;
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
