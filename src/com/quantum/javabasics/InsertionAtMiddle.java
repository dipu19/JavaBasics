package com.quantum.javabasics;

public class InsertionAtMiddle {
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
	public void insert (Node prev,int x)
	{
		Node n=new Node(x);
		if(prev != null) {
			n.next=prev.next;
			prev.next=n;
			return;
		}
		// if total length is at least 1
		if(head != null) {
			n.next = head;
			head = n;
		}
		else {
			head = n;
		}
		
	}
	public static void main(String[] args)
	{
		InsertionAtMiddle iam=new InsertionAtMiddle();
		iam.head=new Node(15);
		iam.insert(null, 20);
		iam.insert(iam.head, 30);
		iam.insert(iam.head.next, 40);
		
		iam.show();
		// 20 15 25 35 45 315
	}
	 
}
