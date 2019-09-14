package com.quantum.javabasics;

import java.util.Comparator;
import java.util.TreeSet;



public class CompareOfString {
	  public static void main(String[] args)
	     {
		  TreeSet s=new TreeSet(new Comp());
		  s.add("xyzz");
		  s.add("ads");
		  s.add("dipuuu");
		  s.add("jay");
		  System.out.println(s);
	     }
	}
	class Comp implements Comparator
	{
		public int compare(Object obj1,Object  obj2)
		{
			String i=obj1.toString();
			String j=obj1.toString();
			int l1=i.length();
			int l2=j.length();
			if(l1<l2)
			{
				return 1;
			}
			else if (l1>l2)
			{
				return -1;
			}
			else
			{
				return i.compareTo(j);
			}
		}
}
