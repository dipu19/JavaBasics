package com.quantum.javabasics;

public class ExampleOfEnum {

	DAY day;
	
	enum DAY
	{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
	}
	public ExampleOfEnum(DAY day)
	{
		this.day  = day;
	}
	public void aboutDay()
	{
		switch (day)
		{
		case SUNDAY:
			System.out.println("Omm Suryaya namaha");
			break;
		
		case MONDAY:
			System.out.println("Har Har Mahadev");
		    break;
			 
		case TUESDAY:
			System.out.println("Jay Maa Mangala");
		    break;
			
		case WEDNESDAY:
			System.out.println("Omm BudhaDbaya Namaha");
			break;
			
		case THURSDAY:
			System.out.println("Jay Maa Laxmi");
			break;
			
		case FRIDAY:
			System.out.println("Jay Maa Santoshi");
			break;
			
		case SATURDAY:
			System.out.println("Jay Sanidev");
			break;
			
		default:
			System.out.println("Jay Jagannath");
			break;
			
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(DAY.FRIDAY);
		
		String str = "MONDAY";
		
		ExampleOfEnum obj = new ExampleOfEnum(DAY.valueOf(str));
		
		obj.aboutDay();
		
		System.out.println(DAY.valueOf(str));
	}
}
