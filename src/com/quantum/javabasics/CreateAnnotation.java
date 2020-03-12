package com.quantum.javabasics;

@interface SmartPhone
{
	 String name () default "Nokia";
	 int modelNo() default 1110;
}
class Customer
{
	int customerId;
	String customerName;
	public Customer() {
		
	}
	
}
@SmartPhone
public class CreateAnnotation {

	
	
}
