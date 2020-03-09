package com.quantum.javabasics;

public class RemoveDuplicateFromLL {

	Node head;
	Node n1;
	Node n2;
	Node n3;
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	//Insert the element in linked list.
	public void insert(int data)
	{
		
		Node node = new Node(data);
		if(head == null)
		{
			node.data = data;
			node.next = null;
			head = node;
			n1 = head;
			
		}
		else
		{
			node.data = data;
			node.next = null;
			n1.next = node;
			n1 = n1.next;
		}
	}
	//traverse elements from linked list.
	public void show()
	{
		Node n1 = head;
		while(n1 != null)
		{
			System.out.print(n1.data+" ");
			n1 = n1.next;
		}
	}
	//removing the element from linked list.
	public void remove(int data)
	{
		Node n2 = null;
		n1 = head;
		if(n1.data == data)
		{
			head = n1.next;
			n1.next = null;
		}
		else
		{
		while(n1.data != data)
		{
			n2 = n1;
			n1 = n1.next;
		}
		n2.next = n1.next;
		n1.next = null;
		}
		System.out.println("\n" +data+" removed from linked list.");
	}
	public void removeElementFromPosition(int position)
	{
		n1 = head;
		int length = 0;
		Node node1 = null;
		n2 = head;
		int count = 0;
		while(n1 != null)
		{
			if(length == position )
			{
				node1 = n1;
				break;
			}
			n1 = n1.next;
			length++;
		}
		while(count != position-1)
		{
		
			
			n2 = n2.next;
		
			count++;
		}
		n2.next = node1.next;
		node1.next = null;
	}
	public int length()
	{
		int length = 0;
		n1 = head;
		while(n1 != null)
		{
			length++;
			n1 = n1.next;
		}
		return length;
	}
	public int node(int position)
	{
		n1 = head;
		int length = 0;
		while(n1 != null)
		{
			if(length == position)
			{
				n2 = n1;
			}
			length++;
			n1 = n1.next;
		}return n2.data;
	}
	public void deleteDuplicate()
	{
		n1 = head;
		System.out.println();
		for(int i = 0;i < length();i++)
		{
			for (int j = i+1;j < length();j++)
			{
				if(node(i) == node(j))
				{
					removeElementFromPosition(j);
					
				}
			}
		}
	}
	public static void main (String[] args)
	{
		RemoveDuplicateFromLL object = new RemoveDuplicateFromLL();
		object.insert(4);
		object.insert(8);
		object.insert(2);
		object.insert(1);
		object.insert(2);
		object.insert(4);
		object.insert(1);
		object.show();
		object.deleteDuplicate();
		object.show();
	}
}
