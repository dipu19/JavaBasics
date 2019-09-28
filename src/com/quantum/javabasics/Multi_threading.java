package com.quantum.javabasics;
  
class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Parent_Thread");
		}
		}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Jay Jagannath");
	
		}
		}
}
public class Multi_threading  {
    public static void main(String[] args)
    {
    	Thread1 ti=new Thread1();
    	Thread2 t2=new Thread2();
    	t2.start();
    	
    	ti.start();
    	
    	for(int i=0;i<5;i++)
    	{
    	System.out.println("Child_Thread");
    
    	}
    	}
}
