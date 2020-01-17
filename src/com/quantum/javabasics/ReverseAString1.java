package com.quantum.javabasics;

public class ReverseAString1 {
	
	public void rev(String s)
	{
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i)+"");
		}
	
	}
	public static void main(String[] args)
	{
		ReverseAString1 rs=new ReverseAString1();
		rs.rev("Dipu");
	}
}
