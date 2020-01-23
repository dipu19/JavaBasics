package com.quantum.javabasics;

import com.quantum.javabasics.LengthOfLL.Node;

public class CountingNode {
  Node head;
   static class Node
   {
	 int data;
	 Node next;
	 public Node(int d)
	 {
		 data=d;
		 next=null;
	 }
   }
   public int length()
   {
	   Node n=head;
	   int count=0;
	   while(n!=null)
	   {
		   count++;
		   n=n.next;
	   }
	   return count;
   }s
   public static void main(String[] args)
   {
	   CountingNode cn=new CountingNode();
	           cn.head=new Node(5);
			   Node a1=new Node(20);
			   Node a2=new Node(30);
			   cn.head.next=a1;
			   a1.next=a2;
			   System.out.println(cn.length());
			   
			   
	   
   }
}
