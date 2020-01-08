package com.quantum.javabasics;

public class ImplementingSttack {
	int stack[];
	int top=-1;
	int capacity;
	public ImplementingSttack()
	{
	    top=-1;
		capacity=5;
		stack=new int[capacity];
	}
	public void push1(int element)
	{
		capacity=5;
		
		
		if(isFull()==0)
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			stack [top]=element;
			System.out.println("Element Inserted");
			//System.out.println(top);
		}
	}
	public int isFull()
	{
		capacity=5;
		
		if(top==capacity)
		{
			return 0;
		}
		else 
		{
			return 1;
		}
		
	}
	public int pop()
	{
		if(isEmpty()==0)
		{
			
			return -1;
			
			
		}
		else
		{
			int x= stack[top];
			top--;
			return x;
		}
	}
	public int isEmpty()
	{
		if(top==-1)
		{
			return 0;
		}
		else 
		{
			return 1;
		}
	}
	
	public static void main(String[] args)
	{
		ImplementingSttack i1=new ImplementingSttack();
		
		  i1.push1(25); i1.push1(225); i1.push1(2225); i1.push1(22225);
		  i1.push1(222225);
		 
	
		
		
		  for(int i=0;i<5;i++) { System.out.println(i1.stack[i]); }
		 
	}
}
