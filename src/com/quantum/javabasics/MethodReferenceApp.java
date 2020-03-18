package com.quantum.javabasics;

@FunctionalInterface
interface UberCab
{
	void rateApp();
}
class UberCustomer 
{
	
	public static void rateOurApp()
	{
		System.out.println("Rate our app");
	}
	public void rateOurApp1()
	{
		System.out.println("Rate Uber App");
	}
}
interface Messenger
{
	public void message();
}
class Message
{
	Message()
	{
		System.out.println("Message not available");
	}
}

public class MethodReferenceApp {

	public static void main(String[] agr)
	{
		UberCab object=UberCustomer::rateOurApp;
		object.rateApp();
		UberCustomer uber = new UberCustomer();
		UberCab object1=uber::rateOurApp1;
		object1.rateApp();
		Messenger msg = Message::new;
		msg.message();
	}
}
