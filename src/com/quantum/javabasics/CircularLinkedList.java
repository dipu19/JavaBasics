package com.quantum.javabasics;

public class CircularLinkedList {
	Node last;
	Node head;
	Node p;
	class Node
	{
		int data;
		Node next;
		public Node(int d)
		{
			data=d;
			next=null;
			
		}
	}
	int length=0;
	public void insert(int d)
	{
		Node n=new Node(d);
		if(length==0)
		{
			head=n;
			last=n;
			p=n;
			length++;
		}
		else
		{
			p.next=n;
			p=n;
			last=n;
			last.next=head;
			length++;
		}
		
		
	}
	public void show()
	{
		Node n=head;
		while(n.next!=head)
		{
			System.out.print(n.data+" ");
			n=n.next;
			
		}System.out.print(n.data);
	}
	public void size()
	{
		int length1=0;
		if(head==null)
		{
		 System.out.println(length1);
		}
		else {
		Node n=head;
		while(n.next!=head)
		{
			length1++;
			n=n.next;
			
		}length1++;
		System.out.println(length1);
		}
	
	}
	public void delete(int del)
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		Node n=head;
		Node prev=null;
		while(n.data!=del)
		{
			prev=n;
			n=n.next;
		}prev.next=n.next;
		System.out.println("deleted node "+n.data);
	}
	public void update(int data,int value)
	{
		Node n=head;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			while(n.data!=data)
			{
				n=n.next;
			}
			n.data=value;
		}
		System.out.println("value of list updated from "+data + " to "+value);
	}
	public static void main(String[] args)
	{
		CircularLinkedList cl=new CircularLinkedList();
		cl.insert(12);
		cl.insert(45);
		cl.insert(50);
		cl.insert(60);
		cl.insert(700);
		cl.insert(00);
		cl.insert(15);
		//cl.show();
		cl.size();
		cl.delete(60);
		cl.update(50,500);
		cl.show();
	}
}
