package com.quantum.javabasics;

enum Mobile
{
	POCO(80,1478),APPLE(100,4812),Mi(50,2510),SAMSUNG(98,8828);
	int price;
	int model;
	private Mobile()
	{
		
	}
	private Mobile(int p, int modelNo)
	{
		this.price=p;
		this.model=modelNo;
	}
	public void getPrice()
	{
		System.out.println(price);
	}
	
	public void getMode()
	{
		System.out.println(model);
	}
	
	
}

public class EnumExample {

	public static void main(String[] args)
	{
		Mobile.Mi.getPrice();
		Mobile.Mi.getMode();
	}
}
