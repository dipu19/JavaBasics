package com.quantum.javabasics;

import java.util.*;

//Example on HashSet.
public class HashSetExample {
	public static void main(String[] args)
	{
		Set <String>s=new HashSet<String>();
		s.add("Dipu");
		s.add("Rama");
		s.add("Hari");
		s.add("Gopala");
		s.add("Dipu");
		s.add(null);
		System.out.println(s);
		
	}
}
