package com.quantum.javabasics;
import java.util.*;
public class CharacterArray {
	public static void main(String[] args)
	{
		char[] arr= {'a','z','j','c'};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
