package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionUsingLambdaExpression {

	public static void main(String[] args)
	{
		Comparator<Integer> c = (i1,i2)->(i1<i2)? +1:(i1>i2)?-1:0;//Ternary Operator.
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(2);
		al.add(3);
		al.add(7);
		al.add(1);
		Collections.sort(al, c);
		System.out.println(al);
		
	}
}
