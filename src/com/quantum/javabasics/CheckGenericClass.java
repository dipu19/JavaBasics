package com.quantum.javabasics;

class NormalClassForGeneric<T,V>
{
	public void outPut(T var1,V var2)
	{
		System.out.println("var1 is "+var1);
		System.out.println("var2 is "+var2);
	}
}

public class CheckGenericClass {

	public static void main(String[] args)
	{
		NormalClassForGeneric <Double,Character>normalClass = new NormalClassForGeneric<>();
		normalClass.outPut(20.0, 'c');
		System.out.println();
		NormalClassForGeneric <String,Double>object = new NormalClassForGeneric<String,Double>();
		object.outPut("Aditya", 5.0);
	}
}
