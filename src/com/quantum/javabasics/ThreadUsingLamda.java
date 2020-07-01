package com.quantum.javabasics;

public class ThreadUsingLamda {

	public static void main(String[] args)
	{
          Runnable t = ()->
         {
        	 for(int i = 0;i<10;i++)
        	 {
        		 System.out.println("Hi i am in runnable ");
        	 }
         };
         Thread thread = new Thread(t);
         thread.start();
         for(int i=0;i<10;i++)
         {
        	 System.out.println("Hi i am in child thread");
         }
	}
}
