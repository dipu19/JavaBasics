package com.quantum.javabasics;

@FunctionalInterface
interface Uber
{
	void book(String msg);
}
class Abcd implements Uber
{
	@Override
	
	public void book( String msg)
	{
		System.out.println("Cab booked");
	}
}

public class LambdaExpression {

	public static void main(String[] args)
	{
		Abcd object = new Abcd();
		object.book("book");
		Abcd object1 = new Abcd()
				{
			       @Override
			       public void book(String msg)
			    {
				 System.out.println("Sir cab booked ");
			    }
				};
				object1.book("hi");
				
			    Uber abc = (String msg)->
				{
					System.out.println("Hi mam booked cab by you is on the way");
				};
				abc.book("hi");
	}
}
