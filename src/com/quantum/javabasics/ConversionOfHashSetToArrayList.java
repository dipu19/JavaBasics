package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.HashSet;

public class ConversionOfHashSetToArrayList {

	public void conversionOfHashSetToArrayList(HashSet books,ArrayList arrayList)
	{
		ArrayList arrayList1 = new ArrayList(books);
		
		HashSet hs = new HashSet(arrayList);
		System.out.println("HashSet contains "+hs);
		
		System.out.println("ArrayList contains :"+arrayList1);
	}
	
	public static void main(String[] args)
	{
		ConversionOfHashSetToArrayList  object = new ConversionOfHashSetToArrayList();
		
		HashSet <String>hs = new HashSet<String>();
		hs.add("books");
		hs.add("Notes");
		hs.add("pens");
		hs.add("Pencils");
		
		ArrayList <String>ar = new ArrayList<String>();
		ar.add("books");
		ar.add("Notes");
		ar.add("pens");
		ar.add("Pencils");
		ar.add("books");
		
		object.conversionOfHashSetToArrayList(hs,ar);
	}
}
