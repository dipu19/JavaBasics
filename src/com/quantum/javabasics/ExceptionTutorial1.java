package com.quantum.javabasics;
import java.io.*;
public class ExceptionTutorial1 {
	public static void main(String[] args)
	{
		try 
		{
			//int s=10/0;
			try
			{
				int a=10/0;
			}
			catch(Exception e)
			{
				System.out.println("jay");
			}finally {
				System.out.println("hello");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("hi"); 
		}
		/*finally {
			System.out.println("hello");
		}*/
	}

} 
