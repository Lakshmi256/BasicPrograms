package com.BridgeLabz.DataStructures;
import com.BridgeLabz.DataStructures.UnorderedList.Node;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class un {
	public static void main(String[] args) throws Exception {
		    File file = new File("/home/bridhelabz/Desktop/lp/lp.txt"); 	  
		    BufferedReader br= new BufferedReader(new FileReader(file)); 
		  	String st=" "; 
			String[] St=null;
		    while ((st=br.readLine()) != null)
		    {
			 St=st.split(" ");
		    }
		    int n=St.length; 
		    Node root=linkedlist.arrayToList(St, n);
		    linkedlist.display(root);
		  
		    Scanner b=new Scanner(System.in);
		    String a=b.nextLine();
		    boolean x=linkedlist.search(root,a);
	        if (x==true) 
	        {
	        	linkedlist.remove(a,root);
	        	linkedlist.display(root);
	            System.out.println("Yes"); 
	        }
	            else
	            {
	            	   Node root1=linkedlist.insert(a);
	            	   System.out.println("No"); 
	            	   root1.next=root;
	            	   linkedlist.display(root1);
	            }	    
	        }
}
