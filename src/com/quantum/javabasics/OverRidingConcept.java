package com.quantum.javabasics;
class Parent
{
	public int add1()
	{//adding 3 number.
		int num1=154;
		int num2=789;
		int num3=45;
		int sum=num1+num2+num3;
		return sum;
	}
}
public class OverRidingConcept extends Parent {
	public int add1()
	{
		//adding 2 number.
		int num1=45;
		int num2=74;
		int sum=num1+num2;
		return sum;
		
	}
	public static void main(String[] args)
	{
		OverRidingConcept e=new OverRidingConcept();
		System.out.println(e.add1());//child method call
	}
}
