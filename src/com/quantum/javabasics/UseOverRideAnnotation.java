package com.quantum.javabasics;

//Annotations
//annotations are used to indicate work to system.
class IndiaPeople
{
	public void showMyStatement()
	{
		System.out.println("Hello India is best");
	}
}
class AmericaPeople extends IndiaPeople
{
	@Override
	@Deprecated
	//deprecated means it is old method 
	public void showMyStatement()
	{
		System.out.println("Hello America is best");
	}
}
public class UseOverRideAnnotation {

	public static void main(String[] args)
	{
		AmericaPeople object =new AmericaPeople();
		 object.showMyStatement();
	}
	
}
