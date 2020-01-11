package com.quantum.javabasics;

public class InserionInQueue {
	int size;
	int arr[];
	int front;
	int rear;
	public InserionInQueue(int d)
	{
		size=d;
		front=0;
		rear=0;
		arr=new int[size];
		
	}
	public void insertion(int n)
	{
		if(front<size)
		{
		arr[front]=n;
		front++;
		}
		else
		{
			System.out.println("Stack is full");
		}
		//System.out.println(front);
	}
	public void show()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void delete()
	{
		if(front==0&&rear==0)
		{
			System.out.println("Queue is empty");
		}
		if(rear==0&&front!=0)
		{
			for(int i=0,j=1;i<size-1&j<size;i++,j++)
			{
				arr[i]=arr[j];
				//front=front-1;
				
				
			}arr[front-1]=0;
			front=front-1;
			
		}
	}
	
	public static void main(String[] args)
	{
		InserionInQueue iq=new InserionInQueue(4);
		
		iq.insertion(2);
		iq.insertion(3);
		iq.insertion(4);
		iq.insertion(5);
		System.out.println("before deleting the object");
		iq.show();
		System.out.println("After deleting the object");
		iq.delete();
		iq.show();
		
	}
}
