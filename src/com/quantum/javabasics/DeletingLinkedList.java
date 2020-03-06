package com.quantum.javabasics;

public class DeletingLinkedList {
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
    		System.out.println(n1.data);
    		n1=n1.next;
    	}
    }
    public void deleteLL()
    {
    	System.out.println("Linked List deleted");
    	head=null;
    }
    public static void main(String[] args)
    {
    	DeletingLinkedList object=new DeletingLinkedList();
    	object.insert(5);
    	object.insert(10);
    	object.insert(15);
    	object.deleteLL();
    	object.show();
    }
}
