package com.quantum.javabasics;
import java.util.*;
public class WeightedUniformString {
	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		HashMap<Integer,Character> m= new HashMap<Integer,Character>();
		for(int i=1,j=97;i<27&j<123;i++,j++)
		{
			m.put(i,(char)j);
		}int sum=0;
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<26;j++)
			{
				if(st.charAt(i)==(char)j)
				{
					sum=sum+j;
				}
			}
		}System.out.println(sum);
	}
}
