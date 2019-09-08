package com.quantum.javabasics;

public class BoooleanProgram {
public boolean result(int a,int b)
{
	if(a>b)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public static void main (String[] args)
{
	BoooleanProgram e=new BoooleanProgram();
	System.out.println(e.result(4, 3));
}
}
