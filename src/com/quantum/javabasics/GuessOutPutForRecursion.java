package com.quantum.javabasics;

public class GuessOutPutForRecursion {

	public int recursion(int x,int y)
	{
		if(y==0)
		{
			return 0;
		}
		return (x+recursion(x,y-1));
	}
	public static void main(String[] args)
	{
		GuessOutPutForRecursion object = new GuessOutPutForRecursion();
		//out put will be x*y
		System.out.println(object.recursion(3, 4));
		
	}
	
}
