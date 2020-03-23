package com.quantum.javabasics;

public class ReversingStringUsingSplit {

	public void rev(String str)
	{
		String token[] = str.split("");
	
	for(int i= str.length()-1;i>=0;i--)
	{
		System.out.print(token[i]);
	}
	}
	public static void main(String[] args)
	{
		ReversingStringUsingSplit object = new ReversingStringUsingSplit();
		object.rev("Dipu SIpu");
	}
}
