package com.quantum.javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product
{
	int pId;
	String pName;
	int price;
	public Product(int pId, String pName, int price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}
	
}
public class LambdaExpressionUsingSorting {
	

	public static void main(String[] args)
	{
	List<Product> product = new ArrayList<Product>();
	product.add(new Product(1,"Phone",14500));
	product.add(new Product(2,"ipad",34500));
	product.add(new Product(3,"watch",1400));
	product.add(new Product(4,"tab",11500));
	Collections.sort(product,(p1,p2)->
	{
		return p1.pName.compareTo(p2.pName);
	});
	for(Product prod:product)
	{
		System.out.println(prod.price);
	}
	}
}
