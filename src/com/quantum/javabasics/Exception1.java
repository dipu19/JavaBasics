package com.quantum.javabasics;



class AgeException extends Exception
{
	AgeException(String s)
	{
		super(s);
	}
}


public class Exception1 {
	public void age1(int age) throws AgeException
	{
		if(age<18)
		{
			 throw  new AgeException("not valid");
		}
		else
		{
			System.out.println("welcome ");
		}
	}
public static void main(String[] args) throws AgeException
{
	Exception1 e=new Exception1();
     e.age1(20);
}
}



