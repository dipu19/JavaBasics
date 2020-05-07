package com.quantum.javabasics;



class Right extends Thread
	{
		public void run()
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("jai");
			
			  try { Thread.sleep(2000); } catch(Exception e) { System.out.println("shree");
			  }
			 
				
			}
		}
	}
	public class ExampleOnJoin 
	{
		public static void main(String[] args) throws Exception
		{
			System.out.println(Thread.currentThread().getName());
			Right r=new Right();
			r.start();
			r.join();
			
			for(int i=0;i<4;i++)
			{
				System.out.println("Jagannath");
				try {
					Thread.sleep(2000);
				}
				catch(Exception e)
				{
					System.out.println("Ram");
				}
			}
		}
    }
