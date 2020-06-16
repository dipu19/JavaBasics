package com.quantum.javabasics;


class NormalClass<T,V>
{
	T var1;
	V var2;
	NormalClass(T var1,V var2)
	{
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public void outPut()
	{
		System.out.println("name is "+var1);
		System.out.println();
		System.out.println("id is "+var2);
	}
}

public class GenericClass<T,V> {
	
	public static void main(String[] args)
	{
		/*
		 * String s1 = "Dipu"; int id = 15;
		 */
		NormalClass <String,Integer>normal = new NormalClass<String,Integer>("Dipu",15);
		normal.outPut();
	}
}
