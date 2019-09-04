package com.quantum.javabasics;
import java.util.*;
public class Pangrams {
public static void main(String[] args)
{
	
    Set <Character>s1=new HashSet<Character>();
	String s="We promptly judged antique ivory buckles for the next prize";
	String replaced=s.replaceAll(" ", "").toLowerCase();
	for (int i=0;i<replaced.length();i++)
	{
		s1.add(replaced.charAt(i));
	}
	if(s1.size()==26)
	{
		System.out.println("pangrams");
	}
	else
	{
		System.out.println("not pangrams");
	}
}
}

