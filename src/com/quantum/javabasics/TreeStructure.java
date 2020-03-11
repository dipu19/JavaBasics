package com.quantum.javabasics;

public class TreeStructure {
   
	Node head;
	
	static class Node
	{
		int data;
		Node prev;
		Node next;
		public Node(int data) {
			this.data=data;
			prev = null;
			next = null;
		}
		
	}
	public void insert(Node root,int data)
	{
		Node node = new Node(data);
		if(data<root.data)
		{
			if(root.prev != null)
			{
			root = root.prev;
			insert(root,data);
			}
			else
			{
				node.data=data;
				root.prev=node;
				System.out.println(node.data+" inserted at left  of "+root.data);
			}
		}
		if(data>root.data)
		{
			if(root.next != null)
			{
				root = root.next;
				insert(root,data);
			}
			else
			{
				node.data=data;
				root.next=node;
				System.out.println(node.data+" inserted at right of "+root.data);
				

			}
		}
		else if(data == root.data)
		{
			System.out.println("Element is already present");
			
		}
	}
	public static void main(String[] args)
	{
		TreeStructure ts =new TreeStructure();
		Node root = new Node(5);
		ts.insert(root, 6);
		ts.insert(root, 4);
		ts.insert(root, 2);
		ts.insert(root, 3);
		ts.insert(root, 6);
	}
}
