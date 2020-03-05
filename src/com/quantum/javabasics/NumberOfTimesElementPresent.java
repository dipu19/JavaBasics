package com.quantum.javabasics;

public class NumberOfTimesElementPresent {

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
		n1=head;
		while(n1!=null)
		{
			System.out.print(n1.data+" ");
			n1=n1.next;
		}
	}
	public void noOfTimes(int integer)
	{
		int count=0;
		n1=head;
		while(n1!=null)
		{
			if(n1.data==integer)
			{
				count++;
				
			}
			n1=n1.next;
		}
		System.out.println(integer+" present "+count+" times");
	}
	public static void main(String[] args)
	{
		NumberOfTimesElementPresent object=new NumberOfTimesElementPresent();
		object.insert(5);
		object.insert(10);
		object.insert(15);
		object.insert(20);
		object.insert(10);
		object.insert(10);
		object.insert(30);
		object.insert(10);
		object.noOfTimes(10);
	}
}
