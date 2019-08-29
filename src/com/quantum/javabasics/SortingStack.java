package com.quantum.javabasics;

import java.util.Stack;
//Sorting a stack using temporary stack.
public class SortingStack {
	public static void main(String[] args)
	{
	Stack<String> a=new Stack<String>();
    a.push("Jay");
    a.push("jagannath");
    a.push("sita");
    a.push("ram");
    a.push("Jay shree ram");
    a.push("jay jagannath");
    for(int i=0,j=1;i<6&j<6;i++,j++)
    {  
    	
    	String s=a.get(i);
    	String t=a.get(j);
    	if(s.length()>t.length())
    	{
    		a.set(i,a.get(j));
    	}
    	else if(s.length()<t.length())
    	{
    		a.set(i,a.get(i));
    		
    	}
    	else if(s.length()==t.length())
    	{
    		a.set(i,a.get(i));
    	}
    }
    for(int i=0;i<6;i++)
    {
    	System.out.println(a.get(i));
    }
	}

}
