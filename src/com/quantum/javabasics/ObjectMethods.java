package com.quantum.javabasics;

public class ObjectMethods implements Cloneable{
	
	int i = 15 ;
	int j ;
	/*
	 * public Object clone() throws CloneNotSupportedException { return
	 * super.clone(); }
	 */

	public static void main(String[] agrs) throws CloneNotSupportedException 
	{
		ObjectMethods object1 = new ObjectMethods();
		//cloning
		object1.j=10;
		System.out.println(object1.j);
	    ObjectMethods object2 = (ObjectMethods) object1.clone();
		
		System.out.println(object2.i);
		//equals method of object
		System.out.println(object2.equals(object1));
		//hash code of the object.
		System.out.println(object1.hashCode());
		//Using get class method.
		System.out.println(object1.getClass());
		// using toString method.
		System.out.println(object1.toString());
		
		
	}
}
