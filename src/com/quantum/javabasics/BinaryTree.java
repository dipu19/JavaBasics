package com.quantum.javabasics;

public class BinaryTree {

	Node head;
	static class Node
	{
		int data;
		Node prev;
		Node next;
		public Node(int d) {
			this.data=d;
			prev=null;
			next=null;
		}
		
	}
	public void insert(Node node,int data)
	{
		if(data<node.data)
		{
			if(node.prev!=null)
			{
				insert(node.prev,data);
			}
			else
			{
				System.out.println("Inserted "+data+" to left of "+node.data);
				node.prev=new Node(data);
			}
		}
		if(data>node.data)
		{
			if(node.next!=null)
			{
				insert(node.next,data);
			}
			else
			{
				System.out.println("Inserted "+data+" to right of "+node.data);
				node.next=new Node(data);
			}
		}
	}
	public void traverse(Node node)
	{
		if(node!=null)
		{
			traverse(node.prev);
			System.out.println(" "+node.data);
			traverse(node.next);
		}
	}
	public static void main(String[] args)
	{
		BinaryTree object=new BinaryTree();
		Node root=new Node(5);
		System.out.println(root.data);
		object.insert(root, 8);
		object.insert(root, 2);
		object.insert(root, 10);
		object.insert(root, 1);
		object.traverse(root);
		
	}
}
