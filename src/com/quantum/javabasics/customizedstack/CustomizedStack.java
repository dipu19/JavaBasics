package com.quantum.javabasics.customizedstack;

public class CustomizedStack {
	int capacity=5;
  int[] stack=new int[capacity];
  int top=0;
  int low=0;
  public void insert(int x)
  {
	 stack[top]= x;
	 top++;
	
	 if(top==capacity)
	 {
		 int[] newStack=new int[capacity+1];
		 for(int i=0;i<capacity;i++)
		 {
			 newStack[i]=stack[i];
			 
			 
		 }
		 stack=newStack;
		 capacity=capacity+1;
		 
	 }
  }
  public void show()
  {
	  for(int i=0;i<capacity-1;i++)
	  {
		  System.out.print(stack[i]+" ");
	  }
  }
  public void delete()
  {
	  capacity=capacity-1;
	  top--;
	  System.out.println("deleted number is "+stack[top]);
  }
  public static void main(String[] args)
  {
	  CustomizedStack stack1=new CustomizedStack();
	  stack1.insert(1);
	  stack1.insert(5);
	  stack1.insert(6);
	  stack1.insert(8);
	  stack1.insert(9);
	  stack1.insert(10);
	  stack1.insert(11);
	  stack1.insert(12);
	  stack1.insert(13);
	  
	  stack1.show();
	  System.out.println();
	
	  stack1.delete();
	  System.out.println();  
	  stack1.show();
  }
}
