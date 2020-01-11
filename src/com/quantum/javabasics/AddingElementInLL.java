package com.quantum.javabasics;

import org.w3c.dom.Node;

public class AddingElementInLL {
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
	public void add1(int x)
	{
		Node n=new Node(x);
		n.next=head;
		head=n;
		
	}
	public void show()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args)
	{
		AddingElementInLL al=new AddingElementInLL();
		al.head=new Node(15);
		Node a1=new Node(21);
		Node a2=new Node(20);
		al.head.next=a1;
		a1.next=a2;
		al.add1(19);
		al.add1(29);
		al.add1(39);
		al.add1(49);
		al.show();
	}
}
