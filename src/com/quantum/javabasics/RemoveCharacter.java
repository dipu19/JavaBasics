package com.quantum.javabasics;

public class RemoveCharacter {

	public void remove(char c,String a)
	{
		String s="";
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=c)
			{
				s=s+a.charAt(i);
			}
		}System.out.println(s);
	}
	public static void main(String[] args)
	{
		RemoveCharacter rm=new RemoveCharacter();
		rm.remove(' ', "di pu");
	}
}
