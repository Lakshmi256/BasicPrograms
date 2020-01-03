package com.BridgeLabz.DeckOfCards;
public class SortDeckOfCards extends Controller{
	 public static String[] sort(String[] arr)
	{
		 int k=0;
		 String[] brr=new String[104];
		 String[] crr=new String[104];
		 for(int i=0;i<arr.length;i++)
		 {
			
			brr=arr[i].split("-",52);
			for (String a:brr)
			{
		     crr[k]=a;
		     k++;
		 }}
		 k=0;
		 String[] br1=new String[13];
		for(int i=0;i<crr.length;i+=2)
		{
			if(crr[k]=="clubs")
			{
				br1[i]=crr[k+1];
			}
				
		}
		
		
			 return arr;       
    }
 public static void main(String[] args) {
		
	 SortDeckOfCards obj=new SortDeckOfCards();
 String[] deck=obj.addCards();
sort(deck);
 Queue<String> queue1=new Queue<String>();
 for(String s:deck)
 {
	  queue1.enqueue(s);
 }
 queue1.show(); 
 Queue<String> p1=new Queue<String>();
 p1.enqueue("Player-1 ");
 Queue<String> p2=new Queue<String>();
 p2.enqueue("Player-2 ");
 Queue<String> p3=new Queue<String>();
 p3.enqueue("Player-3 ");
 Queue<String> p4=new Queue<String>();
 p4.enqueue("Player-4 ");
String str1=queue1.toString();
String[] array1=str1.split(" ");
String[][] array2=obj.distribute(array1);

for(int i=0;i<4;i++)
{
	for(int j=0;j<9;j++)
	{
		if(i==0)
	    p1.enqueue(array2[i][j]);
		else
		if(i==1)
		p2.enqueue(array2[i][j]);
		else
		if(i==2)
		p3.enqueue(array2[i][j]);
		else
		if(i==3)
		p4.enqueue(array2[i][j]);
	}
 }
System.out.println(p1.toString());
System.out.println(p2.toString());
System.out.println(p3.toString());
System.out.println(p4.toString());
}}
