package com.quantum.javabasics;

public class CheckLLIsPalindrome {

	Node head;
	Node n1;
	class Node{
		int data ;
		Node next ;
		Node(int data)
		{
			this.data = data;
			next = null;
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
	public void show()
	{
		n1 = head;
		while(n1 != null)
		{
			System.out.print(n1.data+" ");
			n1 = n1.next;
		}
	}
	public int length()
	{
		int length = 0;
		n1 = head;
		while(n1 != null)
		{
			length++;
			n1=n1.next;
		}
		return length;
	}
	public int  pos(int position)
	{
		n1 = head;
		int length = 0;
		while(n1 != null)
		{
			if(length == position)
			{
				return n1.data;
				
			}
			length ++;
			n1 = n1.next;
		}return 0;
	}
	public void palindrome()
	{
		int count = 0;
		for(int i = 0,j = length()-1 ;i < length() & j >= 0 ;i++,j--)
		{
			if(pos(i) == pos(j))
			{
				count++;
			}
			else
			{
				System.out.println("Linked List is not palindrome");
				break;
			}
		}
		if(count == length())
		{
			System.out.println("Linked List is palindrome");
		}
	}
	public static void main(String[] args)
	{
		CheckLLIsPalindrome object = new CheckLLIsPalindrome();
		object.insert(5);
		object.insert(2);
		object.insert(3);
		object.insert(3);
		object.insert(2);
		object.insert(5);
		object.show();
		System.out.println();
		System.out.println(object.length());
		System.out.println(object.pos(2));
		System.out.println(object.pos(3));
		object.palindrome();
		
	}
	
}
