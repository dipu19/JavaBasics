package com.quantum.javabasics;

public class thirdElementFromLast {

	Node head ;
	Node incrementNode;
	
	
	class Node
	{
		int data;
		Node next;
	  Node(int value )
	  {
		  this.data = value;
		  this.next = null;
	  }
	}
	
	public void insert(int data)
	{
		Node node = new Node(data);
		if(head == null)
		{
			node.data = data;
			node.next = null;
			head = node;
			incrementNode = head;
		}
		else
		{
			node.data = data;
			node.next = null;
			incrementNode.next = node;
			incrementNode = node;
		}
	}
	
	public void traverse()
	{
		Node n2 = head;
		while(n2 != null)
		{
			System.out.print(n2.data+" ");
			n2 = n2.next;
		}
		
	}
	
	public int size()
	{
		int count = 0;
		Node n2 = head;
		while(n2 != null)
		{
			count++;
			n2 = n2.next;
		}
		return count;
	}
	
	public String  findThirdElementFromlast()
	{
		int count = 0;
		int thirdElement = 0;
		Node n2 = head;
		if(size()<3)
		{
			return "In linkedlist there are less than 3 element is present";
		}
		while(n2 != null)
		{
			
			if(count == size()-3)
			{
				thirdElement = n2.data;
				break;
			}
			n2 = n2.next;
			count++;
			
		}return "Third element from last is "+thirdElement;
	}
	
	public static void main(String[] args)
	{
		thirdElementFromLast linkedList = new thirdElementFromLast();
		linkedList.insert(2);
		linkedList.insert(5);
		
		  linkedList.insert(4); linkedList.insert(7); linkedList.insert(15);
		  linkedList.insert(25); linkedList.traverse();
		 
		//System.out.println("\n"+linkedList.size());
		System.out.println();
		System.out.println(linkedList.findThirdElementFromlast());
	}
}
