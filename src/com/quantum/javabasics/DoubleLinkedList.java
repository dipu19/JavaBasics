package com.quantum.javabasics;

public class DoubleLinkedList {
	Node head;
	Node tail;
	static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int d)
		{
			next=null;
			prev=null;
			data=d;
		}
	}
	public void length()
	{
		int count=0;
		Node n=head;
		while(n!=null)
		{
			count++;
			n=n.next;
		}
		System.out.println("Length is "+count);
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
	public void insertFirst(int x)
	{
	    Node n=new Node(x);
		
		if(head!=null)
		{
			head.prev=n;
			n.next=head;
			head=n;
			
		}
		else
		{
			head=n;
			tail=n;
		}
	}
	public void insertLast(int x)
	{
		Node n1=head;
		Node n=new Node(x);
		if(head==null)
		{
			head=n;
		}
		
		{
			while(n1.next!=null)
			{
				n1=n1.next;
				
			}
		}if(n1!=null)
		{
			n1.next=n;
			n.prev=n1;
			tail=n;
			}
	}
	public void insertAtMid(int pos,int x)
	{
		Node n1=head;
		Node n2=head;
		Node n=new Node(x);
		for(int i=1;i<pos;i++)
		{
			n1=n1.next;
		}
		for(int i=1;i<pos-1;i++)
		{
			n2=n2.next;
		}
		
		n.next=n1;
		n1.prev=n;
		n2.next=n;
		n.prev=n2;
		
	}
	public void deleteAtFirst(int x)
	{
		int count=0;
		Node n1=head;
		Node n3=head;
		Node n4=head;
		Node n=new Node(x);
		if(head==null)
		{
			System.out.println("Linked List is empty");
		}
		if(head!=null)
		{
			while(n1.data!=x)
			{
				n1=n1.next;
				count++;
			}
			for(int i=0;i<count-1;i++)
			{
				n3=n3.next;
			}
			for(int i=0;i<count+1;i++)
			{
				n4=n4.next;
			}
			if(n1.data==x)
			{
				n3.next=n4;
				n4.prev=n3;
				
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		DoubleLinkedList dl=new DoubleLinkedList();
		dl.insertFirst(15);
		dl.insertFirst(255);
		dl.insertFirst(265);
		dl.insertAtMid(2, 10);
		dl.deleteAtFirst(255);
		dl.length();
		dl.show();
		
	}
}
