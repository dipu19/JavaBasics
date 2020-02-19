package com.quantum.javabasics;

import org.w3c.dom.Node;

public class LengthOfLL {
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
		
	}
	public void length()
	{
		Node n=head;
		int result=0;
		while(n!=null)
		{
			result++;
			n=n.next;
			
		}
		System.out.println("number of node = "+result);
		
	}
	public static void main(String[] args)
	{
		LengthOfLL ll=new LengthOfLL();
		ll.head=new Node(5);
		Node a1=new Node(15);
		Node a2=new Node(155);
		ll.head.next=a1;
		a1.next=a2;
		ll.length();
		
	}
}
