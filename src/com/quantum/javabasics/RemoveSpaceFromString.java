package com.quantum.javabasics;

public class RemoveSpaceFromString {

	public String remove(String x)
	{
		String x1="";
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)!=' ')
			{
				x1=x1+x.charAt(i);
			}
		}return x1;
	}
	public static void main(String[] args)
	{
		RemoveSpaceFromString st=new RemoveSpaceFromString();
		System.out.println(st.remove("Jay jagannath"));
	}
}
