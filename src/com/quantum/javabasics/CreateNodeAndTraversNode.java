package com.quantum.javabasics;

public class CreateNodeAndTraversNode {

	private Node root;
	private Node node1;
	 static class Node
	 {
		 int data;
		 Node next;
		 Node(int data)
		 {
			 this.data = data;
			 this.next = null;
		 }
	 }
	 public void addNode(int data)
	 {
		 Node node = new Node(data);
		 if(root == null)
		 {
			 node.data = data;
			 node.next = null;
			 root = node;
			 node1 = node;
			 
		 }
		 else
		 {
			 node.data=data;
			 node.next = null;
			 node1.next=node;
			 node1 = node1.next;
		 }
	 }
	 public void update(int newData, int oldData)
	 {
		 if(root!=null)
		 {
			 Node p =root;
			 try {
			 while(p.data!=oldData)
			 {
				 p=p.next;
			 }
			 p.data=newData;
			 System.out.println("Value updated from "+oldData+" to "+newData);
			 }
			 catch(NullPointerException e)
			 {
				 System.out.println("Data you entered for update is not present in datastructure.");
                 
			 }
			 System.out.println();
			
		 }
	 }
	 public void delete(int deleteData)
	 {
		 Node p = root;
		 Node q = root; 
		 if(root.data == deleteData)
		 {
			 root = root.next;
		 }
		 try
			{
		 while(p.data != deleteData)
		 {
			 q=p;
			 p = p.next;
		 }
		 
		
		 q.next = p.next;
		}
		 catch(NullPointerException e)
		 {
			 System.out.println("Data you entered  for delete is not present in datastructure.");
		 }
		 System.out.println();
	 }
	 public void show()
	 {
		 if(root!=null)
		 {
			 Node p = root;
			 while(p!=null)
			 {
				 System.out.print(p.data+" ");
				 p=p.next;
			 }
		 }
	 }
	 public static void main(String[] args)
	 {
		 CreateNodeAndTraversNode ct = new CreateNodeAndTraversNode();
		 ct.addNode(14);
		 ct.addNode(12);
		 ct.addNode(30);
		 ct.addNode(18);
		 ct.update(10, 30);
		 
		 ct.show();
	 }
}
