package com.quantum.javabasics;

public class FindingNodeAtPoss {

	Node head;
	Node n1;
	class Node
	{
		int data;
		Node next;
		public Node(int data)
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
			 n1.next=n1;
			
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
			System.out.print(n1.data + " ");
			n1=n1.next;
		}
	}
	public void dataAtPos(int pos)
	{
		n1=head;
		int length=0;
		while(n1!=null)
		{
			if(length==pos)
			{
				System.out.println(length);
				System.out.println(n1.data+" is present at possition "+pos);
				
				break;
			}length++;
			n1=n1.next;
		}
		if(n1==null)
		{
			System.out.println("you have entered the wrong possition");
		}
					
	}
	public static void main(String[] args)
	{
		FindingNodeAtPoss object=new FindingNodeAtPoss();
		object.insert(5);
		object.insert(10);
		object.insert(15);
		object.insert(20);
		object.dataAtPos(15);
		object.show();
	}
			
}
