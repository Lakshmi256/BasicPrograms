package com.BridgeLabz.DataStructures;
import com.BridgeLabz.utility.Util;
public class AnagramQueue {
	static int Queue[]=new int[200];
	static int size;
	int front;
	static int rear;
	public static void push(int x)
	{
		Queue[rear]=x;
		rear=rear+1;
		size=size+1;
	}
	public static void show()
	{
		System.out.println();
		for (int i=0;i<size;i++)
		{
			System.out.print(Queue[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[1000];
		int[] brr=new int[1000];
		int l=0,c=0;
				for (int n=0;n<1000;n++)
					{
				boolean a=Util.isPrime(n);
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
				System.out.println("the anagram numbers are");
				for (int k=0;k<l;k++)
				{
					int sum=arr[k];
					char[] x=("" + arr[k]).toCharArray();
						for(int m=k+1;m<l;m++)
						{
							char[] y=("" + arr[m]).toCharArray();
						if(	(Util.areAnagram(x,y))==true)				
						{
							brr[c]=arr[k];
							brr[c+1]=arr[m];
							c=c+2;
						}
					}			
				}
	for(int i=0;i<c;i++) {
		push(brr[i]);	
	}
	show();
	}
}
