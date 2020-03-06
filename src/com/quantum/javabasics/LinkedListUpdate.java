package com.quantum.javabasics;

public class LinkedListUpdate {

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
	//insert node in linked list.
	public void insert(int data)
	{
		
		Node node=new Node(data);
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
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data+" ");
			n=n.next;
		}
	}
	public void update(int data,int updatedValue)
	{
		n1=head;
		while(n1!=null)
		{
			if(n1.data==data)
			{
				n1.data=updatedValue;
				System.out.println("Value changed from "+data+" to "+updatedValue);
			break;
			}n1=n1.next;
			
		}
	}
	public static void main(String[] args)
	{
		LinkedListUpdate object=new LinkedListUpdate();
		object.insert(5);
		object.insert(10);
		object.insert(20);
		object.insert(25);
		object.update(20, 35);
		object.update(35, 40);
		object.show();
	}
}
