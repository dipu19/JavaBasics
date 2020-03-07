package com.quantum.javabasics;



class Young extends RuntimeException
{
	public Young(String s) {
		super(s);
}


}
public class ExceptionPractice {
		public static void main(String[] args)throws Exception
	{
		int age=16;
		if(age<18)
		{
			throw new Young("Your age is not eligible to vote");
		}
	}
}