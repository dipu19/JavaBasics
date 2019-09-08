package com.quantum.javabasics;

public class ArthimeticOperation {
	public void add1(int n1,int n2)
	{
		System.out.println(n1+n2);
	}
	public void add1(int n1,int n2,int n3)
	{
		System.out.println(n1+n2+n3);
	}
	public void add1(int n1,int n2,int n3,int n4)
	{
		System.out.println(n1+n1+n3+n4);
	}
	public void add1(int... n)/*it will get less priority
	than other method*/
	{   
		System.out.println("Var-arg method");
	}
	public static void main(String[] args)
	{
		ArthimeticOperation e=new ArthimeticOperation();
		e.add1(5,4,8,787);
	}
	
	
}
