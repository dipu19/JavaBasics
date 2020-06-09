package com.quantum.javabasics;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args)
	{
		Stack <Integer>stack = new Stack<Integer>();
		
		System.out.println(stack.capacity());
		
		stack.push(15);
		
		stack.push(25);
		
		//System.out.println(stack.pop());
		
		System.out.println(stack.peek());
	}
}
