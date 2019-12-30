package com.quantum.javabasics;

import java.util.HashMap;

//Example on HashMap
public class HashMapExample {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "Dipu");
		hm.put(1, "Sipu");
		hm.put(3, "Ram");
		hm.put(4,"Tossali");
		hm.put(2,"Gopal");
		for(int i=0;i<5;i++)
		{
			System.out.println(hm.get(i));
		}
		//Here insertion order not preserved we will get the output according to sorting of keys.
		hm.remove(3);
		System.out.println("After removing the element"+hm);
		hm.entrySet();
		System.out.println(hm);
	}
}
