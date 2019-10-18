package com.quantum.javabasics;
import java.util.*;
public class GameOfThrones {
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		 Set<Character> set = new HashSet<Character>();
		    for(Character ch : s.toCharArray()){
		        if(set.contains(ch)){
		            set.remove(ch);
		        }else{
		            set.add(ch);
		        }
		    }

		    System.out.println((set.size()<=1)?"YES":"NO");
	}
}
