package com.BridgeLabz.DataStructures;
import com.BridgeLabz.DataStructures.UnorderedList.Node;
public class linkedlist{
	static Node head;
	public static Node insert(String data)
	{
		Node node=new Node();
		node.data=data;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
			n.next=head;
		}
		return head;
	}
	static void display(Node head) 
	{ 
	    while (head != null)  
	    { 
	        System.out.print(head.data + " "); 
	        head = head.next; 
	    } 
	} 
	public static Node arrayToList(String arr[], int n) 
	{ 
	    Node head = null; 
	    for (int i = n - 1; i >= 0 ; i--) 
	      head=insert(arr[i]);
		return head; 
	} 
	public static boolean search(Node head,String x)
	{ 
		Node current=head;    
    while (current!=null) 
    { 
        if (current.data.equals(x)) 
            return true;
        	//data found 
        current = current.next; 
    } 
    return false;
	}
	public static void remove(String a,Node root)
	{
		Node temp=head,prev=null;
		if (temp != null && temp.data == a) 
        { 
            root=temp.next; // Changed head 
            return; 
        } 
		while(temp!=null && temp.data!=a) 
        { 
            prev=temp; 
            temp=temp.next; 
        }    
		if (temp==null) return;
		   prev.next=temp.next; 
	}
}
