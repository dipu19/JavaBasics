package com.quantum.javabasics;

import java.util.LinkedList;

public class LinkedListPass {
		public static void  main(String[] args)
		{
			LinkedList <Integer>ll=new LinkedList<Integer>();
			ll.add(15);
			ll.add(12);
			ll.add(25);
			ll.add(35);
			ll.add(46);
			System.out.println(ll.get(ll.size()/2));
		}
}
