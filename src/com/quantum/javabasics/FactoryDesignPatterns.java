package com.quantum.javabasics;

public class FactoryDesignPatterns {

	public static void main(String[] args)
	{
		FactoryOfOs object = new FactoryOfOs("");
		
		
		OperatingSysytem os = object.os();
		os.specification();
	}
}
