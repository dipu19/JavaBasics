package com.quantum.javabasics;

public class InsertInStack {

	int[] arr;
	int top;
	//it follows last in and first out
	public void create(int size)
	{
		 arr = new int[size];
		System.out.println("stack created");
	}
	public void insert(int data)
	{
		
		if(top<arr.length)
		{
		arr[top]=data;
		top++;
		
		}
		else
		{
			System.out.println("Stack is full");
		}
	}
	public void delete()
	{
		
		if(top >= 0)
		{
			top--;
			System.out.println("Element deleted from stack" );
		}
		else
		{
			System.out.println("Stack is empty");
		}
	}
	public void show()
	{
		for(int i = 0;i<top;i++ )
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		InsertInStack stack = new InsertInStack();
		stack.create(4);
		stack.insert(1);
		stack.insert(2);
		stack.insert(3);
		stack.insert(4);
		stack.insert(5);
		stack.delete();
		stack.delete();
		stack.delete();
	
		

		stack.show();
	}
	
}
