package com.BridgeLabz.DataStructures;
import java.io.*;
import java.util.Scanner;
public class UnorderedList {
	static class Node  
	{ 
	    String data; 
	    Node next; 
	}; 
	static Node insert(Node root, String item) 
	{ 
	    Node temp = new Node(); 
	    temp.data = item; 
	    temp.next = root; 
	    root = temp; 
	    return root; 
	} 
	static void display(Node root) 
	{ 
	    while (root != null)  
	    { 
	        System.out.print(root.data + " "); 
	        root = root.next; 
	    } 
	} 
	static Node arrayToList(String arr[], int n) 
	{ 
	    Node root = null; 
	    for (int i = n - 1; i >= 0 ; i--) 
	        root = insert(root, arr[i]); 
	    return root; 
	}   
	public static  boolean search(Node head,String x)
	{ 
		Node current = head;    //Initialize current 
    while (current != null) 
    { 
        if (current.data == x) 
            return true;    //data found 
        current = current.next; 
    } 
    return false;
	}
	public static void main(String[] args) throws Exception {
		  // TODO Auto-generated method stub
		  File file = new File("/home/bridhelabz/Desktop/lp/lp.txt"); 	  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  String st=" "; 
			 String[] St = null;
		  while ((st = br.readLine()) != null)
		  {
			 St=st.split(" ");
		  }
		  String arr[] =St; 
		    int n = arr.length; 
		    Node root = arrayToList(arr, n);
		    Scanner b=new Scanner(System.in);
		    String a=b.nextLine();
	        if (search(root, a)) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 
		    display(root);
	}
}