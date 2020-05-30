package com.quantum.javabasics;

interface Ifruit
{
	public String type="Apple";
}

class Fruits implements Ifruit
{
	
}


public class OutPutThree {

	public static void main(String[] args)
	{
		System.out.println(Fruits.type);
	}
}
