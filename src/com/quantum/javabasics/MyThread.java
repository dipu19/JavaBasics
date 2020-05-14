package com.quantum.javabasics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread  {

	

	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++)
		{
			MyRunnable runnable = new MyRunnable("My worked thread "+ i);
			executor.execute(runnable);
			
		}
		executor.shutdown();
		while(!executor.isTerminated())
		{
			
		}
		
		System.out.println("All the services are terminated");
	}
}
