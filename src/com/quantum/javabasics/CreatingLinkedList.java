package com.quantum.javabasics;

import org.w3c.dom.Node;

public class CreatingLinkedList {
	
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
	public static void main(String[] args)
	{
		CreatingLinkedList cl=new CreatingLinkedList();
		cl.head=new Node(5);
		Node second =new Node(8);
		Node third=new Node(10);
		cl.head.next=second;
		second.next=third;
		
	}
}
