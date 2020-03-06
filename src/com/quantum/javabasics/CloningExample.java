package com.quantum.javabasics;

class Abc implements Cloneable
{
	int variable1=5;
	int variable2=6;
	
	public String toString() {
		return "Abc [variable1=" + variable1 + ", variable2=" + variable2 + "]";
	}
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
}

public class CloningExample {

	public static void main(String[] args) throws CloneNotSupportedException
	{
	Abc object1=new Abc();
	Abc object2=new Abc();//deep cloning
	object2.variable2=8;
	Abc object3=object1;
	//object3.variable2=10;//shallow cloning
	
	Abc object4=(Abc) object1.clone();
	System.out.println(object1);
	System.out.println(object2);
	System.out.println(object3);
	System.out.println(object4);
	}
}
