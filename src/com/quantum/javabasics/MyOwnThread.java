package com.quantum.javabasics;

    class MyOwnThread1 extends Thread
    {
    	public void run()
    	{
    		for(int i=0;i<5;i++)
    		{
    			System.out.println("Jay Jagannath");
    		}
    	}
    }
    
    public class MyOwnThread  
  	{
    	public static void main(String[] args) throws InterruptedException
    	{
    		MyOwnThread1 thread = new MyOwnThread1();
    		thread.start();
    		
    		thread.setPriority(7);
    		
    		thread.sleep(1500);
    		
    		System.out.println(thread.getName());
    		
    		thread.currentThread().sleep(1000);
    		
    		System.out.println(thread.currentThread().getName());
    		System.out.println(thread.getPriority());    		
    		for(int i=0;i<5;i++)
    		{
    			System.out.println("Keep others happy");
    		}
    	}

	}

	

