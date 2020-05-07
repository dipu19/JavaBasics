package com.quantum.javabasics;

import java.util.Collections;
import java.util.HashMap;

//Example on HashMap
public class HashMapExample {

	public static void main(String[] args)
	{
		HashMap<Character,String> hm=new HashMap<Character,String>();
		hm.put('a', "Dipu");
		hm.put('b', "Sipu");
		hm.put('c', "Ram");
		hm.put('d',"Tossali");
		hm.put('C',"Gopal");
		
		System.out.println("After removing the element"+hm);
		
	
	}
}
