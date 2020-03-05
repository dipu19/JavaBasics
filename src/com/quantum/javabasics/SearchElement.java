package com.quantum.javabasics;

public class SearchElement {
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
    	Node node=new Node( data);
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
    public void search(int data)
    {
    	n1=head;
    	
    	while(n1!=null)
    	{
    		if(n1.data==data)
    		{
    			System.out.println();
    			System.out.println(data +" present in linked list");
    			break;
    		}
    		n1=n1.next;
    	}
    	if(n1==null)
    	{
    		System.out.println();
    		System.out.println(data+" is not present in linked list");
    	}
    	
    		
    	
    }
    public static void main(String[] args)
    {
    	SearchElement object=new SearchElement();
    	object.insert(5);
    	object.insert(10);
    	object.insert(15);
    	object.show();
    	object.search(25);
    }
	
}
