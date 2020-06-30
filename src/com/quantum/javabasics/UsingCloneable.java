package com.quantum.javabasics;

public class UsingCloneable implements Cloneable {

	public String string = "Dipu"; 
	public static void main(String[] args)
	{
		UsingCloneable obj = new UsingCloneable();
		
		try {
		UsingCloneable obj1 = (UsingCloneable)obj.clone();
		System.out.println(obj1.string);
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		}
	}
}
