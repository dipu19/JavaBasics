package com.quantum.javabasics;

class   Customized extends Exception
{
	Customized(String s)
	{
		super(s);
	}
}

public class Queue {

	int top;
	int end;
	int[] arr;
	int size;
	int length;
	Queue(int size)
	{
		this.size=size;
		arr = new int[size];
	}
	public void push(int data) throws Customized
	{
		
		if(length<size)
		{
		if(top==0)
		{
		arr[end] = data;
		top++;
		}
		else
		{
			for(int i=length;i>0;i--)
			{
				arr[i] = arr[i-1];
			}
			arr[end] = data;
			top++;
		}
		}
		length++;
		if(length>size)
		{
			throw new Customized("Queue is full");
		}
	}
	public void show()
	{
		for(int i=0;i<top;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public void delete()
	{
		if(top>0)
		{
			top--;
		}
		else
		{
			System.out.println("Queue is empty");
		}
	}
	public void search(int element)
	{
		for(int i=0;i<top;i++)
		{
			if(arr[i] == element)
			{
				System.out.println( "element present at position " + (i+1));
				break;
			}
			else
			{
				if(i+1 == top)
				{
					System.out.println("sorry "+element+" is not present");
				}
			}
		}
	}
	public static void main(String[] args) throws Customized
	{
		Queue queue =new Queue(5);
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		queue.search(6);
		
		queue.show();
	}
	
}
