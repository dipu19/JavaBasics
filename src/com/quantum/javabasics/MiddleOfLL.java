package com.quantum.javabasics;

public class MiddleOfLL {

	// finding middle of linked list.
	Node head;
	Node n1;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public void insert(int data)
	{
		Node node=new Node( data);
		if(head==null)
		{
			node.data=data;
			node.next=null;
			head=node;
			n1=head;
			
		}
		else
		{
			node.data=data;
			node.next=null;
			n1.next=node;
			n1=n1.next;
		}
	}
	public void show()
	{
		n1=head;
		while(n1!=null)
		{
			System.out.println(n1.data);
			n1=n1.next;
		}
	}
	public void pos(int possition)
	{
		n1=head;
		int length=0;
		while(n1!=null)
		{
			if(length==possition)
			{
				System.out.println(n1.data +" is present ");
				break;
			}length++;
			n1=n1.next;
		}
	}
	public void middleNode()
	{
		n1=head;
		int length=0;
		while(n1!=null)
		{
			length++;
			n1=n1.next;
		}
		pos(length/2);
		
	}
	public static void main(String[] args)
	{
		MiddleOfLL object=new MiddleOfLL();
		object.insert(5);
		object.insert(10);
		object.insert(15);
		object.insert(20);
		object.insert(25);
		object.middleNode();
		
		
		
	}
}
