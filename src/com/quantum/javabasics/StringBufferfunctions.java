package com.quantum.javabasics;

public class StringBufferfunctions {

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Dipu");
        
		//sb.append(" told jay Jagannath ");
		
		//sb.append('a');
		
		char[] ch = new char[2];
		ch[0] = 'a';
		ch[1] = 'b';
		
		//sb.append(ch);
		
		//sb.delete(1, 3);
		
		int capacity = sb.capacity();
		
		//System.out.println(capacity);
		
		sb.trimToSize();
		
		System.out.println(sb);
		
	}
	
}
