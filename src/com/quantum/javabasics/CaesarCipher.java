package com.quantum.javabasics;

public class CaesarCipher {
	public static void main(String[] args)
	{
		String s="good-morning";
		String s1="";
		int k=2;
		char ch=' ';
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)!='-')
		{
		  int ascii=s.charAt(i)+k;
		  
		  s1= Character.toString(ascii);
		  
		}else if(s.charAt(i)=='-')
		{
			 s1=Character.toString('-');
		}
		System.out.println(s1);
		}
		
	}

}
