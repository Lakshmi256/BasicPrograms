package com.BridgeLabz.DataStructures;
import java.io.*;
import java.util.Scanner;
public class UnorderedList {
	static Node head;
	static class Node  
	{ 
	    String data; 
	    Node next;
		public Object head;
	} 
	static Node insert(Node head, String item) 
	{ 
	    Node temp=new Node(); 
	    temp.data=item; 
	    temp.next=head; 
	    head=temp; 
	    return head; 
	} 
	static void display(Node head) 
	{ 
	    while (head!=null)  
	    { 
	        System.out.print(head.data + " "); 
	        head=head.next; 
	    } 
	} 
	static Node arrayToList(String arr[], int n) 
	{ 
	    Node head=null; 
	    for (int i=n - 1; i >= 0 ; i--) 
	    	head=insert(head, arr[i]); 
	    return head; 
	}   
	public static  boolean search(Node head,String x)
	{ 
		Node current=head;     
    while (current!=null) 
    { 
        if (current.data.equals(x)) 
            return true;
        current=current.next; 
    } 
    return false;
	}
	public static void remove(String a)
	{
		Node temp=head,prev=null;
		if (temp != null && temp.data == a) 
        { 
            head= temp.next; // Changed head 
            return; 
        } 
		while (temp !=null && temp.data != a) 
        { 
            prev = temp; 
            temp = temp.next; 
        }      
		if (temp == null) return;
		   prev.next = temp.next; 
	}
	public static void main(String[] args) throws Exception {
		  File file = new File("/home/bridhelabz/Desktop/lp/lp.txt"); 	  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  	String st=" "; 
			String[] St=null;
		  while ((st=br.readLine()) != null)
		  {
			 St=st.split(" ");
		  }
		    int n=St.length; 
		    Node root=arrayToList(St, n);
		  	Node head=null;
		    Scanner b=new Scanner(System.in);
		    String a=b.nextLine();
		    boolean x=search(root,a);
	        if (x==true) 
	        {
	        	remove(a);
	        	display(root);
	            System.out.println("Yes"); 
	        }
	            else
	        {
	                	Node root1=insert(head,a);
	            	   System.out.println("No"); 
	            	   root1.next=root;
	            	   display(root1);
	        }
	}
}