package com.BridgeLabz.utility;
import java.util.Arrays;
import java.util.Scanner;
public class Util {
	public static double distance(double x,double y)
	{
		double sum=Math.sqrt((x*x)-(y*y));
		return sum;
	}
	private static Scanner sc;
	static
	{
		sc=new Scanner(System.in);
	}
	public static  int readInt()
	{
		return sc.nextInt();
	}
	public static String readString()
	{
		return sc.nextLine();
	}
	public static  double readdouble()
	{
		return sc.nextDouble();
	}
	public static void  quad(double a,double b,double c)
	{
		double delta=(b*b)-(4*a*c);
		double x1=(-b)+ Math.sqrt(delta)/2*a;
		double x2=(-b)- Math.sqrt(delta)/2*a;
		System.out.println(x1+" "+x2);
	}
	public static void  wind(double t,double v)
	{
		if ((t>50)&&(v<120)&&(v>3))
		{
		double w=(35.74+0.6215*t+(0.4275*t-35.75))*Math.pow(v,0.6);
		System.out.println("the whind s=chill is :"+w);
		}
		else
		{
		System.out.println("invalid inputs");
		}
	}
	public static void  dayofweek(int d,int m,int y)
	{
		int y1,x,m0,d0;
		y1=y-((14-m)/12);
		x=y1+y1/4-y1/100+y1/400;
		m0=m+(12*((14-m)/12)-2);
		d0=(d+(x*31*m0)/12)%7;
		int day=(int)d0;
			System.out.println(day);
	}
	public static void  sqrt(double num)
	{
		double t=num;
		double epsilon=1.0e-15;
		if (num>0)
		{
			while(Math.abs(t-num/t)>epsilon*t)
			{
				 t=((num/t)+t)/2.0;
			}
			System.out.println("t="+t);

			}
		else
		{
			System.out.println("given number is negitive num");
			}
	}
	public static void  month(double p,double r,double t)
	{
		double n=12*t;
		double R=r/(12*100);
		double payment= (p*R)/(1-Math.pow((1+R),(-n)));
		System.out.println("the monthly payment is:"+payment);
	}
	public static void temp(int x,double T)
	{
		if (x==0)
		{
			double sum=(T*9/5)+32;
			System.out.println("C to F c"+sum);
		}
		else
		{
			double sum=(T-32)*5/9;
			System.out.println("F to C :"+sum);
		}
	}
	public static void tobin(int n)
	{
		int[] binnum=new int[1000];
		int i=0;
		while(n>0)
		{
			binnum[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
			System.out.print(binnum[j]);
	}

	public static void vend(int cash)
{
	int arr[]=new int[] {1000,500,100,50,10,5,2,1};
	for (int i=0;i<arr.length;i++)
	{
	if (cash>=arr[i]);
	{
	int x=cash/arr[i];
	cash=cash%arr[i];
	System.out.println(arr[i]+" notes:"+x);
}
	}
	}
	public static void swap(char[] ch, int i, int j)
	{
	char temp = ch[i];
	ch[i] = ch[j];
	ch[j] = temp;
	}
	public static void permutations(char[] c, int currentIndex)
	{
	if (currentIndex == c.length - 1) {
	System.out.println(String.valueOf(c));
	}
	for (int i = currentIndex; i < c.length; i++)
	{
	swap(c, currentIndex, i);
	permutations(c, currentIndex + 1);
	swap(c, currentIndex, i);
	}}
	public static int binarySearch(String[] arr, String x) 
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
		public static boolean areAnagram(char[] str1, char[] str2) 
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
		public static  boolean isPrime(int n)
	    { 
	        if (n <= 1) 
	            return false; 
	   	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false;  
	        return true;
	    } 
public static boolean ispallindrome(int n)
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
public static void fyn(int arr[]) {
	  int l = 0, r = arr.length; 
      while (l <= r) { 
          int m = l + (r - l) / 2; 
System.out.println("if "+arr[m]+" is your number enter 1 else o");

int x=readInt();
if (x==0)
{
	System.out.println("if"+arr[m]+"is greather than your number enter 1 else o");
	int y=readInt();
	if (y==1)
	       l = m + 1; 
  else
      r = m - 1;
}
else 
{
	System.out.println("number found "+arr[m]);
}
      }
      }
public static void merge(int arr[], int l, int m, int r) 
{ 
    int n1 = m - l + 1; 
    int n2 = r - m;  
    int L[] = new int [n1]; 
    int R[] = new int [n2]; 
    for (int i=0; i<n1; ++i) 
        L[i] = arr[l + i]; 
    for (int j=0; j<n2; ++j) 
        R[j] = arr[m + 1+ j]; 
	        int i = 0, j = 0; 
	        int k = l; 
    while (i < n1 && j < n2) 
    { 
        if (L[i] <= R[j]) 
        { 
            arr[k] = L[i]; 
            i++; 
        } 
        else
        { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 
    while (i < n1) 
    { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    } 
    while (j < n2) 
    { 
        arr[k] = R[j]; 
        j++; 
        k++; 
    } 
} 
	    void sort(int arr[], int l, int r) 
{ 
    if (l < r) 
    { 
        int m = (l+r)/2; 
        sort(arr, l, m); 
        sort(arr , m+1, r); 
        merge(arr, l, m, r); 
    } 
} 
public static void printArray(int arr[]) 
{ 
    int n = arr.length; 
    for (int i=0; i<n; ++i) 
        System.out.print(arr[i] + " "); 
    System.out.println(); 
} 
public static void flip(int n)
{
	double hcn=0,tcn=0;
	for(int i=0;i<n;i++)
	{
		double x=Math.random();
		if(x>0.5)
			hcn++;
		tcn++;
	}
	double s,r;
	s=(tcn/n)*100;
	r=(hcn/n)*100;
	System.out.println("the % head count:"+r+"  the % tail count :"+s);
}
public static void leap(int x)
{
	int a=x,count=0;
	while(a!=0)
	{
		a=a/10;
		count++;
	}
	if(count==4)
	{
		if((x%4==0)&&(x%100!=0)&&(x%400==0))
			System.out.println("given year is a leap year");
		System.out.println("given year is not a leap year");
	}
	else
	{
		System.out.println("entered year is not 4 digit nums");
	}
}
public static void poweroftwo(int n)
{
	int sum=1;
	for(int i=0;i<n;i++)
	{
		 sum =sum*2;
	}
System.out.println(sum);
}
public static void gambler(int stake,int goal,int n)
{
	int win=0,loss=0,i=0;
	while((i!=n)&&(stake!=goal))
	{
	if(Math.random()<0.5)
	{
		win++;
		stake++;
	}
	else
	{
		loss++;
		stake--;
	}
	i++;
	}
	int wp=(win*100)/n;
	int lp=(loss*100)/n;
	System.out.println("number of wins ="+win);
	System.out.println("percentage wins ="+wp+"%");
	System.out.println("percentage loss ="+lp+"%");
}
public static void coupon(char[] chars)
{
	int max=100000000;
	int random=(int)(Math.random()*max);
	StringBuffer sb=new StringBuffer();
	while(random>0)
	{
		sb.append(chars[random%chars.length]);
		random/=chars.length;
	}
	String c=sb.toString();
	System.out.println("coupon number= "+c);
}
public static void harmonic(int n)
{
	double sum=0;
	for(double i=1;i<=n;i++)
	{
		sum=sum+1/i;
	}
	System.out.println(sum);
}
public static void primefactors(int n)
{
	while(n%2==0)
	{
		System.out.println(2+" ");
		n/=2;
	}
	for(int i=3;i<=Math.sqrt(n);i+=2)
	{
		while(n%i==0)
		{
			System.out.println(i+" ");
			n/=i;
		}
	}
	if(n>2)
	{
		System.out.println(n);
	}
}
}
