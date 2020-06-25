package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableExample implements Comparable<ComparableExample> ,Comparator<ComparableExample>{

	Integer age;
	String name;
	String bookName;
	public ComparableExample()
	{
		
	}
	public ComparableExample(Integer age, String name, String bookName) {
		
		this.age = age;
		this.name = name;
		this.bookName = bookName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public int compareTo(ComparableExample obj)
	{
		if(age >obj.getAge())
		{
			return -1;
		}
		if(age == obj.getAge())
		{
			return 0;
		}
		
		return 1;
		//return this.age.compareTo(obj.getAge());
	}
	
	public int compare(ComparableExample object1, ComparableExample object2)
	{
		if(object1.age == object2.age)
		{
			return 0;
		}
		if(object1.age > object2.age)
		{
			return -1;
		}
		return 1;
	}
	
	
	
	public static void main(String[] args)
	{
		ComparableExample obj1 = new ComparableExample(12, "Dipu", "Mathematics");
		ComparableExample obj2 = new ComparableExample(15,"Api","History");
		ComparableExample obj3 = new ComparableExample(18,"Sipu","Geography");
		ComparableExample obj4 = new ComparableExample(10,"Ram","Story book");
		ComparableExample obj5 = new ComparableExample(10,"Lakshman","Song book");
		ArrayList<ComparableExample> ar = new ArrayList<ComparableExample>();
		
		ar.add(obj1);
		ar.add(obj2);
		ar.add(obj3);
		ar.add(obj4);
	    ar.add(obj5); 
		/*
		 * Collections.sort(ar);
		 * 
		 * for(ComparableExample elements:ar) {
		 * System.out.print(elements.getName()+" "+elements.getBookName()+" "+elements.
		 * getAge()); System.out.println(); }
		 */
		 
		
		  Collections.sort(ar, new ComparableExample());
		  
		  for(ComparableExample elements:ar ) {
		  System.out.print(elements.getName()+" "+elements.getBookName()+" "+elements.
		  getAge()); System.out.println(); }
		 
		
	}
}
