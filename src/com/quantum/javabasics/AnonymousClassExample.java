package com.quantum.javabasics;

interface Anonymous
{
	void age();
}

class MyClass1
{
	Anonymous object = new Anonymous()
			{
	           public void age()
	           {
	        	   System.out.println("Hii i am inside anonymous class.");
	           }
			};
}

public class AnonymousClassExample {

	public static void main(String[] args)
	{
		MyClass1 object = new MyClass1();
		object.object.age();
	}
}
