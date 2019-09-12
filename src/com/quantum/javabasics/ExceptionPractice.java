package com.quantum.javabasics;



class TooYoung extends RuntimeException
{
	public TooYoung(String s) {
		super(s);
}


}
public class ExceptionPractice {
		public static void main(String[] args)throws ArithmeticException
	{
		int age=16;
		if(age<18)
		{
			throw new TooYoung("Your age is not eligible to vote");
		}
	}
}