package com.quantum.javabasics;

public class DeletionNode {
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
	public void show()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public void delete(int x)
	{
		Node prev = null;
		Node n1=head;
		if(prev==null&&n1.data==x)
		{
			head=n1.next;
			n1=null;
		}
		while(n1.data!=x)
		{
			prev=n1;
			n1=n1.next;
		}
		if(n1.data==x)
		{
			prev.next=n1.next;
			n1=null;
		}
		
		
	}
	
	public static void main(String[] args)
	{
		DeletionNode dn=new DeletionNode();
		dn.head=new Node(15);
		Node a1=new Node(25);
		Node a2=new Node(35);
		Node a3=new Node(45);
		dn.head.next=a1;
		a1.next=a2;
		a2.next=a3;
		System.out.println("Before deleting");
		dn.show();
		System.out.println();
		System.out.println("after deleting" );
		dn.delete(45);
		dn.show();
		
		
	}
}
