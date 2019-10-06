package com.quantum.javabasics;
import java.util.*;
public class SubString {

	public static void main(String[] args) {
		System.out.println("Enter the 1st string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Enter the 2nd string");
		String s1=sc.nextLine();
		String s2="NO";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s.charAt(i)==s1.charAt(j))
				{
					s2="YES";
				}
			}
						
		}System.out.println(s2);

	}

}
