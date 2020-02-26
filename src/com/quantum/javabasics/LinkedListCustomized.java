package com.quantum.javabasics;

public class LinkedListCustomized {

	Node head;
	Node n1;
	 class Node
	{
		int data;
		Node next;
		public Node(int d) {
			data=d;
			next=null;
		}
	}	
		public void insert(int d)
		{
			Node n=new Node(d);
			if(head==null)
			{
			n.data=d;
			n.next=null;
			head=n;
			n1=n;
			}
			else
			{
				
				n.data=d;
				n.next=null;
				n1.next=n;
				n1=n1.next;
			}
			
		}
		public void show()
		{
			Node n=head;
			while(n!=null)
			{
				System.out.println(n.data+" ");
				n=n.next;
			}
		}
		public void loop() 
		    { 
		        Node slow = head;
		        Node fast = head; 
		        while (slow != null && fast != null && fast.next != null) { 
		            slow = slow.next; 
		            fast = fast.next.next; 
		            if (slow == fast) { 
		                System.out.println("Found loop"); 
		                
		            } 
		        } 
		        System.out.println("not found"); 
		    } 
		public static void main(String[] args)
		{
			LinkedListCustomized ll=new LinkedListCustomized();
			ll.insert(15);
			ll.insert(25);
			ll.insert(35);
			ll.insert(40);
			ll.loop();
			ll.show();
		}
		
		
	}

